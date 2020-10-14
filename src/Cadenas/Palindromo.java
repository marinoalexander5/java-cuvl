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
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        String palabra = entrada.next();
        StringBuffer palabraInvertida = new StringBuffer(palabra); 
        palabraInvertida.reverse();
        
        if(palabra.equalsIgnoreCase(palabraInvertida.toString())){
            System.out.println("La palabra " + palabra + " es un palindromo!");
        } else {
            System.out.println("La palabra " + palabra + " no es un palindromo");
        }
        
    }
    
}
