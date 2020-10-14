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
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     * 
     * Leer un número e indicar si es positivo o negativo. El proceso se 
     * repetirá hasta que se introduzca un 0.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int num;
        
        System.out.println("Ingrese un entero positivo o negativo, o 0 para finalizar: ");
        while (flag){
            num = entrada.nextInt();
            if(num > 0){
                System.out.println("El numero " + num + " es positivo.\n");
            } else if (num < 0){
                System.out.println("El numero " + num + " es negativo.\n");
            } else {
                System.out.println("Fin del programa.");
                flag = false;
            }
        }
    }
    
}
