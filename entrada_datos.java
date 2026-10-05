// importar librerias
import java.util.Scanner; // para tipo Scanner

public class entrada_datos {
    public static void main(String[] args)
    {
    // INGRESAR DATOS EN JAVA MEDIANTE LA CONSOLA
    // opcion 1: Declarar nuevo objeto tipo scanner
        Scanner scan = new Scanner(System.in);

        // Escribir por consola
        System.out.println("Escribe tu nombre:");
        // Leer por consola
        String nombre1 = scan.nextLine();

        // Escribir por consola. Mensaje + variable
        System.out.println("Tu nombre es:" + nombre1);
        // Desechar objeto scanner
        scan.close(); 


    // Opcion 2:
        IO.println("Hola, buen dia!");
        String nombre2 = IO.readln("Escribe tu nombre: ");
        IO.println("Tu nombre es:" + nombre2);

    }
}
