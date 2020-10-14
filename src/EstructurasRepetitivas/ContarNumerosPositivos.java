/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author AlexanderMarino
 */
public class ContarNumerosPositivos {

    /**
     * @param args the command line arguments
     * Introducir números hasta que se teclee uno negativo, y mostrar cuántos 
     * números se han introducido.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int num;
        int contador = 0;
        
        System.out.println("Ingrese un numero positivo para continuar o uno negativo para finalizar");
        while (flag){
            num = entrada.nextInt();
            if (num >= 0){
                contador++;
            } else {
                System.out.println("Se han introducido " + contador + " numeros positivos");
                flag = false;
            }
        }
        
    }
    
}
