package com.example.myhealthapp.models

public class Provider{

    lateinit var loggedIn : Client;
    lateinit var objectifs : List<Objectif>;
    lateinit var exercices : List<Exercice>;
    var loaded : Boolean = false;

    fun getObjectifById(id : String) : Objectif? {
        for (objectif : Objectif in objectifs){
            if(objectif.id == id) return objectif;
        }
        return null;
    }
    fun getExerciceById(id : String) : Exercice? {
        for (exercice : Exercice in exercices){
            if(exercice.id == id) return exercice;
        }
        return null;
    }

    fun exercicesRecommande() : Set<Exercice> {
        var doneExercies : Set<Exercice> = loggedIn.doneExercices();
        var aux : MutableSet<Exercice> = mutableSetOf <Exercice>();

        for (exercice : Exercice in exercices) { // on parcours les exercices disponible

            if(!doneExercies.contains(exercice)){ // on vérifie que l'exercice n'est pas déjà fait

                for ( obj : Objectif in exercice.objectifs){ // on parcours les objectifs réalisés par un exercice

                    if(loggedIn.followedObjectifs.contains(obj)){
                        aux.add(exercice) // choufi how to add element to a set
                        break;
                    }
                }
            }

        }

        return aux;

    }

    fun fetchData(){

    }

    fun fetchObjectifs(){

    }

    fun fetchExercices(){

    }

    fun fetchUser(){

    }

    fun fetchActivities(){

    }

}