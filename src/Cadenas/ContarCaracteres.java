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
public class ContarCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String palabra1 = entrada.nextLine();
        System.out.println("Ingrese otra palabra");
        String palabra2 = entrada.nextLine();
        
        int caracteres1 = palabra1.length();
        int caracteres2 = palabra2.length();
        
        if (caracteres1 < caracteres2) {
            System.out.println("La palabra " + palabra1 + " tiene menos caracteres");
        } else {
            System.out.println("La palabra " + palabra2 + " tiene menos caracteres");
        }
    }
}
    
