package com.example.myhealthapp.models;

import java.util.Date;

public class Personne {

    final String id;
    final String nom;
    final String prenom;
    final String email;
    final Date birthday;

    Personne(String id, String nom, String prenom, String email, Date birthday){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.birthday = birthday;
    }
}

