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
public class NumeroEnRango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        
        System.out.println("Ingrese el limite inferior de un rango");
        int minRango = entrada.nextInt();
        
        System.out.println("Ingrese el limite superior de un rango");
        int maxRango = entrada.nextInt();
        
        System.out.println("Ingrese un numero dentro del rango");
        while (flag){
            int enRango = entrada.nextInt();
            if (!(enRango <= minRango || enRango >= maxRango)){
                flag = false;
                System.out.println("Correct!\nEl numero " + enRango + " esta entre " + minRango + " y " + maxRango );
            }
        }
    }

}
