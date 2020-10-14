/*
 * Una cuenta bancaria tiene 30000 pesos de saldo. El usuario ingresará
 *  valores que corresponden a extracciones vía cajero automático. Por
 *  cada extracción se debe mostrar como quedó el saldo luego de la
 *  operación. Una extracción que supere al saldo disponible se debe
 *  rechazar indicando que no es posible la operación. El programa finaliza
 *  cuando el saldo queda en cero.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author AlexanderMarino
 */
public class cuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        double saldoActual = 30000;
        double valorExtraccion = 0;
        
        while (saldoActual > 0){
            System.out.println("\nEl saldo actual es de $" + saldoActual);
            System.out.print("Ingrese valor a extraer: ");
            valorExtraccion = entrada.nextDouble(); 
            if (valorExtraccion <= saldoActual){
                saldoActual -= valorExtraccion;
            } else {
                System.out.println("La operacion no es posible. El limite de extraccion es de $" + saldoActual);
            }            
        }
        System.out.println("\nNo hay mas dinero en la cuenta.");
    }
    
}
