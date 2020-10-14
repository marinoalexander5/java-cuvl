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
public class SumarNumeros {

    /**
     * @param args the command line arguments
     * Pedir números hasta que se teclee un 0, mostrar la suma de todos los 
     * números introducidos.
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num = 1;
        float sumatoria = 0;
        int centinela = 0;
        
        System.out.println("Ingrese un numero real, o '0' para finalizar");
        while(num != centinela){
            num = entrada.nextFloat();
            sumatoria += num;
        }
        System.out.println("Fin del programa, la suma total es " + sumatoria);    
    }    
}
