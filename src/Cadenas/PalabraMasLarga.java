/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadenas;

import java.util.Scanner;

/**
 *
 * @author alito
 */
public class PalabraMasLarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int largoPalabraMasLarga = 0;
        int idxPalabraMasLarga = 0;
        
        System.out.println("Ingrese una frase");
        String frase = entrada.nextLine();
        String[] palabras = frase.split(" ");
        for ( int i = 0; i < palabras.length; i++){
            if (palabras[i].length() > largoPalabraMasLarga){
                idxPalabraMasLarga = i;
                largoPalabraMasLarga = palabras[i].length();
            }
        }
        System.out.println("Palabra mas larga: " + palabras[idxPalabraMasLarga]);
    }
    
}
