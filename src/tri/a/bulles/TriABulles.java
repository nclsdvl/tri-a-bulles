/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri.a.bulles;

import java.util.Arrays;

/**
 *
 * @author Ivu
 */
public class TriABulles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int X = (int) (Math.random() * 50); // creation d'une variable aléatoire pour la taille de mon tableau
        int tab[] = new int[X];
        int varTemp;                       // variable temporaire pour stocker mon chiffre a deplacer

        for (int i = 0; i < tab.length; i++) {             // remplissage aleatoire
            tab[i] = (int) (Math.random() * 1000);  // de mon tableau
        }

        System.out.println("mon tableau avant tri : ");   // impression du tableau avant tri
        System.out.println(Arrays.toString(tab) + "\n");

//--------------------------------- DOUBLE BOUCLE POUR LE TRI A BULLES ----------------------------------------//
        // permet le deplacement eventuelle du premier nombre jusqu'a ce qu'il rencontre un chiffre <
        // le i permet de renouveller l'operation autant de fois qu'il y a de chiffres dans tab
        // le j permet de repeter l'operation en repartant depuis le premier nombre du tableau réactualisé
        // j<tab.length -1 afin de ne pas sortir du tableau
        
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                while (tab[j] < tab[j + 1]) {
                    varTemp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = varTemp;
                }
            }

        }
        // impression du tableau avant tri
        System.out.println("mon tableau avant tri : ");
        System.out.println(Arrays.toString(tab) + "\n");
    }

}
