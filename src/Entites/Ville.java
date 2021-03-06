/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import Entites.Entite;

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

    public boolean isSatellite() { //initialisation du getter
        return satellite;
    }

    
    public void setSatellite(boolean satellite) { // initialisation du setter
        this.satellite = satellite;
    }

    @Override
    public String toString() {
        return super.toString() + ", satellite=" + satellite +" / " ;
    }



    }
