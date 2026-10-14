// import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
    // En este codigo se define un algoritmo para
    // capturar una lista de asistencia de alumnos
    
    // Paso 1: crear una lista de asistencia de alumnos
        
        String[] alumnos = new String[27];

        alumnos[0] = "Álvarez Urrea Chelsea Jeraldyn";
        alumnos[1] = "Avila Ramirez Emmanuel";
        alumnos[2] = "Escareño Solorio Juan Mauricio";
        alumnos[3] = "Escobedo Guerra Victor Manuel";
        alumnos[4] = "González De Alba Francisco Javier";
        alumnos[5] = "Gonzalez Rossi Santiago";
        alumnos[6] = "Hernandez Aguilar Emiliano";
        alumnos[7] = "Lozano Aldana José Mariano";
        alumnos[8] = "Macias Hernandez Luis Leonardo";
        alumnos[9] = "Manrique Morales Fernanda Arely";
        alumnos[10] = "Marquez Esparza Saul Alejandro";
        alumnos[11] = "Meza Lozano Barbara";
        alumnos[12] = "Montoya Sandoval Viery Dassaeb";
        alumnos[13] = "Ornelas González Gael";
        alumnos[14] = "Pimentel Dolores Angel Salvador";
        alumnos[15] = "Piñon Garcia Axel Emmanuel";
        alumnos[16] = "Ramírez Zaldumbide Ignacio Xavier";
        alumnos[17] = "Rodríguez Arellano Cruz Ángel";
        alumnos[18] = "Rodríguez Santoyo Diego Tadeo";
        alumnos[19] = "Sánchez Álvarez Ingrid Regina";
        alumnos[20] = "Sierra Perez José Angel";
        alumnos[21] = "Torres Gonzalez Cesar Santiago";
        alumnos[22] = "Tovar Romero Jhostyn Alexander";
        alumnos[23] = "Trejo Hernández Jorge Alonso";
        alumnos[24] = "Vazquez Gomez Angel De Jesus";
        alumnos[25] = "Vilchis Perez Jose Miguel";
        alumnos[26] = "Viveros Tellez Kevin";
        
        // definir un arreglo de asistencia
        boolean[] asistencia = new boolean[27];
        Scanner consola = new Scanner(System.in);
        
        // definir variables acumuladoras para asistencias y faltas
        int asistencias=0;
        int faltas=0;

        // Paso 2: capturar datos de asistencia

        // Reto 1: cómo puedo calcular el numero de asistencias y faltas
        //  sin usar un ciclo for adicional?
        // Reto 2: cómo puedo mostrar los nombres de los alumnos que
        //  no asistieron a clase sin almacenar un arreglo de asistencia?
        ArrayList<String> no_asistieron = new ArrayList<String>();
        // no_asistieron.add(alumnos[i]);
        // no_asistieron.get(i);
        // no_asistieron.size();


        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("\nIngresa la asistencia de " + alumnos[i] + " (True/False): ");
            //asistencia[i]= Boolean.parseBoolean(consola.nextLine()); 
            boolean respuesta = Boolean.parseBoolean(consola.nextLine());
            if (respuesta) {
                asistencias++;
            } else {
                faltas++;
                no_asistieron.add(alumnos[i]);
            }


        }    
        consola.close();

        // Paso 3: calcular resumen de asistencia
        /* 
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i]) {
                asistencias++;
            } else {
                faltas++;
            }
        }*/

        // Paso 4: mostrar resumen de asistencia
        System.out.println("Número de alumnos que asistieron: " + asistencias);
        System.out.println("No asistieron: " + faltas);
        
        // mostrar los nombres de los alumnos que no asistieron
        /*for (int  i = 0; i < asistencia.length; i++) {
            if (!asistencia[i]) {
                System.out.println(alumnos[i] + " no asistió a clase.");
                }
        */
        for (int  i = 0; i < no_asistieron.size(); i++) {
            System.out.println(no_asistieron.get(i) + " no asistió a clase.");
        }

    }
    
}
