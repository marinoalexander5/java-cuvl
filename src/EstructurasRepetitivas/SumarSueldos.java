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
public class SumarSueldos {

    /**
     * @param args the command line arguments
     * 
     * Pedir números hasta que se teclee un 0, mostrar la suma de todos los
     * números introducidos.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        float sumatoria = 0;
        float sueldo;
        
        System.out.println("Ingrese 10 sueldos");
        for (int i = 1; i <= 10; i++){
            System.out.print("Sueldo " + i + ": $");
            sueldo = entrada.nextFloat();
            sumatoria += sueldo;
            if (sueldo > 35000){
                contador++;
            }
        }
        System.out.println("El total de sueldos es " + sumatoria);
        System.out.println(contador + " de ellos son mayores a $35.000");
    }
    
}
