package com.example.myhealthapp.models;

import java.util.*;

class ExoCognitif extends Exercice {

    ExoCognitif(String id, String nom, double duree, Map<String,String> etapes, Difficulte difficulte, List<Objectif> objectifs){
        super(id, nom, duree, etapes, difficulte, objectifs);
    }
}
