package com.example.myhealthapp.models;

import java.util.*;

public class Exercice {

    final String id;
    final String nom;
    final double duree; //le tout en minute puis y'aura une conversion
    final Map<String,String> etapes;
    final Difficulte difficulte;

    final List<Objectif> objectifs;

    Exercice(String id, String nom, double duree, Map<String,String> etapes, Difficulte difficulte, List<Objectif> objectifs){
        this.id = id;
        this.nom = nom;
        this.duree = duree;
        this.etapes = etapes;
        this.difficulte = difficulte;
        this.objectifs = objectifs;
    }
}
