/*
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
 * miden más de 1.75.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author AlexanderMarino
 */
public class edadAlturaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float sumaAltura = 0;
        float sumaEdad = 0;
        int contadorMayores = 0;
        int contadorAltos = 0;
        
        System.out.println("Ingrese edad y aluta de 5 alumnos: ");
        for (int i=1; i<=5; i++){
            System.out.print("Edad " + i + " : ");
            int edad = entrada.nextInt();
            System.out.print("Altura " + i + " : ");
            float altura = entrada.nextFloat();
            
            sumaAltura += altura;
            sumaEdad += edad;
            
            if (edad > 18){
                contadorMayores ++;
            }
            if (altura > 1.75){
                contadorAltos ++;
            }
        }
        float edadMedia = sumaEdad/5;
        float alturaMedia = sumaAltura/5;
        
        System.out.println("\nEdad Media: " + edadMedia);
        System.out.println("Altura Media: " + alturaMedia);
        System.out.println("Cantidad de alumnos mayores a 18 anios: " + contadorMayores);
        System.out.println("Cantidad de alumnos que miden mas de 1.75: " + contadorAltos);
    }
    
}
