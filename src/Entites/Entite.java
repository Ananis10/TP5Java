/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Chloé_Canhan
 */
public class Entite {
    private String nom;
    private double richesse;

    public Entite(String nom, double richesse) { // initialisation du constructeur
        this.nom = nom;
        this.richesse = richesse;
    }

    public String getNom() { // initialisation du getter
        return nom;
    }

    public double getRichesse() {
        return richesse;
    }

    
}
