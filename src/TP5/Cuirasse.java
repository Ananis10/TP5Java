/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5;

/**
 *
 * @author Meyer
 */
public class Cuirasse extends navires {
    private int NbrCanon;

    public Cuirasse(int NbrCanon, String nom, double PuissanceDeFeu) {
        super(nom, PuissanceDeFeu);
        this.NbrCanon = NbrCanon;
    }

    public int getNbrCanon() {
        return NbrCanon;
    }
    
    
}
