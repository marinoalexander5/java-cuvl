/*
 * En un colegio existe la posibilidad de elegir, en la materia "lengua
 * extranjera", entre las siguientes opciones: [I]nglés, [F]rancés,
 * [P]ortugués y [A]lemán. Se ingresa, para cada alumno, la lengua
 * elegida. La computadora muestra el porcentaje de alumnos que eligió
 * cada lengua, en forma de número
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author AlexanderMarino
 */
public class lenguaExtranjera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de alumnos");
        int numeroAlumnos = entrada.nextInt();
        int totalIngles = 0;
        int totalFrances = 0;
        int totalPortugues = 0;
        int totalAleman = 0;
        
        System.out.println("Idiomas: [I]ngles, [F]rances, [P]ortugues, [A]leman");
        for (int i = 1; i <= numeroAlumnos; i++) {
            System.out.println("Ingrese la lengua extranjera seleccionada por el alumno " + i + " :");
            String idioma = entrada.next();
            
            switch (idioma){
                case "I": 
                    totalIngles ++;
                    break;
                case "F": 
                    totalFrances ++;
                    break;
                case "P": 
                    totalPortugues ++;
                    break;
                case "A": 
                    totalAleman ++;
                    break;
                    
            }                      
        }
        System.out.println("El " + (totalIngles*100)/numeroAlumnos + "% de los alumnos eligió Ingles");
        System.out.println("El " + (totalFrances*100)/numeroAlumnos + "% de los alumnos eligió Frances");
        System.out.println("El " + (totalPortugues*100)/numeroAlumnos + "% de los alumnos eligió Portugues");
        System.out.println("El " + (totalAleman*100)/numeroAlumnos + "% de los alumnos eligió Aleman");
    }
    
}
