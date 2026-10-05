public class tipos_datos {
    public static void main(String[] args) {
        System.out.println("=== 1. TIPOS PRIMITIVOS (Los básicos de Java) ===");
        IO.println("En Java existen varios tipos de datos, los más usados son: int, double, boolean y char");
        
        // TIPOS PRIMITIVOS (Los básicos de Java)
        // DECLARACION DE VARIABLES: tipo nombreVariable = valor;
        // Números enteros (el más usado es int)
        int edad = 20;
        long poblacionMundial = 8000000000L; // Lleva una 'L' al final por ser muy grande
        
        // Números con decimales (el más usado es double)
        double precio = 199.99;
        float altura = 1.75f; // Lleva una 'f' al final
        
        // Valores lógicos (Verdadero o Falso)
        boolean esPersona = true;
        
        // Un solo carácter (va entre comillas simples)
        char inicial = 'L';
        
        // DECLARACION DE CONSTANTES mediante la palabra 'final'
        // No se puede cambiar su valor durante la ejecucion del programa
        final double PI = 3.14159; 
        final int DIAS_SEMANA = 7;
        final String NOMBRE_PAIS = "México";
        final boolean ES_VERDADERO = true;
        final char LETRA = 'A';
        final long NUMERO_GRANDE = 10000000000L;
        final float NUMERO_DECIMAL = 2.5f;
        

        // TIPOS DE DATOS COMPLEJOS (No primitivos)
        System.out.println("\n=== 2. TIPOS DE DATOS COMPLEJOS (No primitivos) ===");
        // String NO es primitivo, es una clase y sirve para guardar textos completos (va entre comillas dobles)
        String nombre = "Carlos";
        String saludo = "¡Hola, bienvenidos a Java!";
        
        // Arreglos, son colecciones de tamaño fijo)
        // Un arreglo guarda varios elementos del MISMO tipo en casillas ordenadas
        System.out.println("\n=== 3. ARREGLOS: Colecciones de tamaño fijo ===");
        String[] telefonos = {"477-456-7890", "0987654321", "5555555555"};
        
        // Existen dos formas de declarar un arreglo:
        // Opción A: Declarar y asignar valores de una vez
        int[] calificaciones = {90, 85, 100, 70, 95};
        
        // Opción B: Crear un arreglo vacío indicando cuántos espacios tendrá (ej. 3 nombres)
        String[] amigos = new String[3];
        amigos[0] = "Ana";
        amigos[1] = "Luis";
        amigos[2] = "Sofia";
        int[] cantidades = {10, 20, 30, 40, 50};

    }
}
