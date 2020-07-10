package com.example.myhealthapp.models;

import java.util.*;

class ExoPhysique extends Exercice {

    final double kcal;

    ExoPhysique(String id, String nom, double duree, Map<String,String> etapes, Difficulte difficulte, List<Objectif> objectifs ,double kcal){
        super(id, nom, duree, etapes, difficulte, objectifs);
        this.kcal = kcal;
    }
}
