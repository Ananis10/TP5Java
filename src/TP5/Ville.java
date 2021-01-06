/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5;

/**
 *
 * @author Chloé_Canhan
 */
public class Ville extends Entite {
    private boolean satellite;

    public Ville(boolean satellite, String nom, double richesse) { // initialisation du constructeur
        super(nom, richesse);
        this.satellite = satellite;
    }

    
    public void setSatellite(boolean satellite) { // initialisation du setter
        this.satellite = satellite;
    }
    
    
}
