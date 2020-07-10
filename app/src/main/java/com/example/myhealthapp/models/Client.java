package com.example.myhealthapp.models;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.*;

public class Client extends Personne {

    double poids;
    double taille;

    List<Activite> activites;
    List<Objectif> followedObjectifs;
    Nutrition plan;

    Client(String id, String nom, String prenom, String email, Date birthday, double poids, double taille, Nutrition plan){
        super(id, nom, prenom, email, birthday);
        this.poids = poids;
        this.taille = taille;

        this.plan = plan;
        activites = new ArrayList<Activite>(); // initialisation de la liste
        followedObjectifs = new ArrayList<Objectif>(); // initialisation de la liste
    }

    Activite getCurrentAct(){

        for (Activite act: activites) {
            if(act.dateFin == null) return act;
        }

        return null;
    }// pour récuperer l'activité en cours

    @RequiresApi(api = Build.VERSION_CODES.O)
    void setCurrentAct(Exercice exercice) throws MyException {
        if(this.getCurrentAct() != null) throw new MyException("Vous etes entrain de faire une activité !");
        Activite act = new Activite(this.id+exercice.id, Date.from(Instant.now()), this, exercice);
        activites.add(act);
    }

    void followObjectif(Objectif obj){
        followedObjectifs.add(obj);
    }

     Set<Exercice> doneExercices(){
        Set<Exercice> aux = new HashSet<Exercice>();

        for(Activite activite : activites){ // parcours toutes activités pour
            if (! aux.contains(activite.exo)) aux.add(activite.exo);
        }

        return aux;
    }

    Activite getActiviteById(String id){

        for (Activite act: activites) {
            if(act.id == id) return act;
        }

        return null;
    }
}

