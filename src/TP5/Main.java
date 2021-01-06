/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP5;

import Navires.navires;
import Navires.SousMarin;
import Navires.Cuirasse;
import Entites.Ile;
import Entites.Ville;
import Entites.Entite;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author anais
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        navires[] tableau = new navires[4];
        Cuirasse c1 = new Cuirasse(8, "Le Richelieu", 12);
        Cuirasse c2 = new Cuirasse(5, "Le Jean Bart", 19);

        SousMarin s1 = new SousMarin(85, "Le Suffren", 20);
        SousMarin s2 = new SousMarin(72, "Le triomphant", 14);

        LinkedList<navires> ListeNavire = new LinkedList<>();
        ListeNavire.add(c1);
        ListeNavire.add(c2);
        ListeNavire.add(s1);
        ListeNavire.add(s2);

        System.out.println(ListeNavire);

        Cuirasse c5 = new Cuirasse(8, "Le Richelieu", 12);

        Ville v1 = new Ville(true, "Paris", 98);
        Ville v2 = new Ville(false, "Berlin", 66);  // création des 2 villes

        Ile i1 = new Ile(false, "Bora-Bora", 78);
        Ile i2 = new Ile(true, "Tasmanie", 45);

        ArrayList<Entite> liste = new ArrayList<>();     // création de la liste
        liste.add(v1);
        liste.add(v2);
        liste.add(i1);
        liste.add(i2);
        System.out.println(liste);
    }

}
