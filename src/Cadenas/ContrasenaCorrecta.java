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
public class ContrasenaCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contrasena = "aGKMnsdol34-asdf";
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca su contrasena");
            String ingreso = entrada.nextLine();
            if (ingreso.equals(contrasena)){
                System.out.println("Contraseña correcta");
                i = 3;
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
        
        
    }
    
}
