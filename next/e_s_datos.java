package next;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class e_s_datos { 
    public static void main(String[] args) {
        // FORMAS DE INGRESAR DATOS EN JAVA pasar a la presentacion
        System.out.println("=== 1. FORMAS DE INGRESAR DATOS EN JAVA ===");
        System.out.println("Existen varias formas de ingresar datos en Java");
        System.out.println("las más comunes son: Scanner y JOptionPane");

        // 1. Scanner (Se importa la clase Scanner) consola
        System.out.println("\n=== 2. Scanner ===");
        System.out.println("Scanner es una clase que permite leer datos desde la consola");
        System.out.println("Para usar Scanner, primero se debe importar la clase: ");
        System.out.println("import java.util.Scanner;");
        System.out.println("las librerias se importan al inicio del código");
        System.out.println("Luego se crea un objeto de tipo Scanner y se usa para leer datos");
        System.out.println("Ejemplo:");
        System.out.println("Scanner sc = new Scanner(System.in);");
        System.out.println("int edad = sc.nextInt(); // Lee un número entero");
        System.out.println("String nombre = sc.nextLine(); // Lee una línea de texto");
        
        // 2. JOptionPane (Se importa la clase JOptionPane) cuadro de dialogo grafico
        System.out.println("\n=== 3. JOptionPane ===");
        System.out.println("JOptionPane es una clase que permite mostrar cuadros de diálogo para ingresar datos");
        System.out.println("Para usar JOptionPane, primero se debe importar la clase: import javax.swing.JOptionPane;");
        System.out.println("Luego se usa el método showInputDialog para mostrar un cuadro de diálogo y leer datos");
        System.out.println("Ejemplo:");
        System.out.println("String nombre = JOptionPane.showInputDialog(\"Ingresa tu nombre:\");");
        System.out.println("int edad = Integer.parseInt(JOptionPane.showInputDialog(\"Ingresa tu edad:\")); // Convierte a int");




        
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = scan.nextLine();

        System.out.println("Tu nombre es:" + nombre);
        scan.close(); 

        // Cargas tu imagen
        // previamente tratado con python para redimensionar
        Icon icon_msg = new ImageIcon("img/hogar.png"); 

        String nombre1 = (String) JOptionPane.showInputDialog(
            null, // componentePadre
            "Escribe tu nombre:", // mensaje texto
            "Entrada de datos", // titulo cuadro
            //JOptionPane.QUESTION_MESSAGE,
            JOptionPane.PLAIN_MESSAGE, // tipo de cuadro para modificar el icono
            icon_msg, // icono usado
            null,
            null 
        );

        System.out.println("Tu nombre es:" + nombre1);

        // cuadro de dialogo sencillo con el icono de java
        String nombre2 = JOptionPane.showInputDialog("Ingresa tu nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));

        System.out.println("Tu nombre es:" + nombre2);
        System.out.println("Tu edad es:" + edad);
    }
}
