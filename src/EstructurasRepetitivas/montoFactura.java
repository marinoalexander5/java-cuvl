/*
 * Pida una cantidad de artículos comprados y
 * el precio unitario de ese artículo. Por cada carga debe preguntar si se
 * desea seguir ingresando de la forma “¿Desea ingresar otro artículo?
 * [S/N]”. La carga de datos finaliza cuando se detecta una n o N. La
 * computadora debe mostrar el monto de la factura.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author AlexanderMarino
 */
public class montoFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "S";
        double montoFactura = 0;
        
        while (!respuesta.equalsIgnoreCase("n")){
            System.out.println("Ingrese la cantidade articualos comprados: ");
            int numeroArticulos = entrada.nextInt();
            System.out.println("Ingrese el precio unitario de ese articulo: ");
            double precioUnitario = entrada.nextDouble();
            montoFactura += numeroArticulos * precioUnitario;
            
            System.out.println("¿Desea ingresar otro aritculo? [S/N]");
            respuesta = entrada.next();
        }
        System.out.println("El monto total de la factura es de: $" + montoFactura);
    }
    
}
