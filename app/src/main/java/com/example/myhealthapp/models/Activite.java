package com.example.myhealthapp.models;

import java.util.Date;

public class Activite {
    final String id;
    final Date dateDebut; // date de debut de l'activité
    Date dateFin; // date de fin

    final Client client;
    final Exercice exo;

    Activite(String id, Date dateDebut, Client client, Exercice exo){
        this.id = id;
        this.dateDebut = dateDebut;
        this.client = client;
        this.exo = exo;
    }

    void terminerActiviter(Date dateFin) throws MyException {
        if(dateFin != null) throw new MyException("Activitée déjà terminée!"); // On peut pas terminer une activité qui l'est déjà! donc on throw une exception
        this.dateFin = dateFin;
    }
}
