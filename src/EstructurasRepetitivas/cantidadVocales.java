/*
 * Pida un carácter al usuario y que por cada
 * carga pregunte si se desea seguir ingresando. De la forma “¿Desea
 * ingresar otro carácter? [S/N]”. La carga de datos finaliza cuando se
 * detecta una n o N. La computadora debe mostrar la cantidad de letras
 * vocales ingresadas. (Debe admitir mayúsculas y minúsculas).
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author AlexanderMarino
 */
public class cantidadVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta = "S"; 
        int contadorVocales = 0;
        String caracter = "";
        
        while (!respuesta.equalsIgnoreCase("n")){
            System.out.print("Ingrese 1 caracter: ");   
            caracter = entrada.nextLine();
            System.out.println("¿Desea ingresar otro caracter? [S/N]");
            respuesta = entrada.nextLine();
            if (caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i") || caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u")){
                contadorVocales ++;
            }
        }
        System.out.println("\nSe ingresaron " + contadorVocales + " vocales.");
    }
    
}
