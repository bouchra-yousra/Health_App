package com.example.myhealthapp.models;

import java.util.List;

public class Objectif {

    final String id;
    final String name;

    final List<Exercice> exercices;

    Objectif(String id, String name, List<Exercice> exercices){
        this.id = id;
        this.name = name;
        this.exercices = exercices;
    }
}
