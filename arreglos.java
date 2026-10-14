public class arreglos {
    public static void main(String[] args) {
    // En este codigo se define un algoritmo para manipular 
    // arreglos de datos

    // ejercicio 1: crear una lista de asistencia de alumnos
        
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
        int asistencias=0;
        int faltas=0;

        // capturar datos de asistencia
        for (int i = 0; i < alumnos.length; i++) {
            asistencia[i] = Boolean.parseBoolean(
                IO.readln("Ingresa la asistencia de " + alumnos[i] + " (true/false): ")
            );        
        }    
        // reto: mostrar un resumen de asistencia
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i]) {
                asistencias++;
            } else {
                faltas++;
            }
        }

        // cuantos alumnos asistieron y cuantos no asistieron
        System.out.println("Número de alumnos que asistieron: " + asistencias);
        System.out.println("No asistieron: " + faltas);

        // mostrar los nombres de los alumnos que no asistieron
        for (int  i = 0; i < asistencia.length; i++) {
            if (!asistencia[i]) {
                System.out.println(alumnos[i] + " no asistió a clase.");
                }

                
        }
    }
}
