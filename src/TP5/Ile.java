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
public class Ile extends Entite {
    private boolean port;

    public Ile(boolean port, String nom, double richesse) { //initialisation du constructeur
        super(nom, richesse);
        this.port = port;
    }

    
    public void setPort(boolean port) { // initialisation du setter
        this.port = port;
        
        
    }
    
    
}
