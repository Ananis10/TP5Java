/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5;

public class SousMarin extends navires{
    private int PorteeSonar;

    @Override
    public String toString() {
        return  "nom=" + nom + ", PuissanceDeFeu=" + PuissanceDeFeu + ", PorteeSonar=" + PorteeSonar + '}';
    }

    public int getPorteeSonar() {
        return PorteeSonar;
    }

    public SousMarin(int PorteeSonar, String nom, double PuissanceDeFeu) {
        super(nom, PuissanceDeFeu);
        this.PorteeSonar = PorteeSonar;
    }    
}