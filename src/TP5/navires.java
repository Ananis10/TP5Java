/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5;

import java.util.LinkedList;

/**
 *
 * @author Meyer
 */
public class navires {
    String nom;
    double PuissanceDeFeu;


    
    
    public String getNom() {//get pour acceder nom et puissancefeu dans le main
        return nom;
    }

    public double getPuissanceDeFeu() {//get pour acceder nom et puissancefeu dans le main
        return PuissanceDeFeu;
    }

    public navires(String nom, double PuissanceDeFeu) {// constructeur pour indiquer que la valeur est fixée dès le départ
        this.nom = nom;
        this.PuissanceDeFeu = PuissanceDeFeu;
    } 
}
