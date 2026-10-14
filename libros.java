import java.util.Scanner;

public class libros {
    public static void main(String[] args){
    // en esta clase se define un algoritmo para capturar 
    // datos de un libro y mostrarlos en pantalla

    // definición de variables
    String titulo;
    String autor;
    int num_paginas;
    double precio;

    // captura de datos
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime el titulo del libro: ");
    titulo = sc.nextLine();
    System.out.print("Dime el autor del libro: ");
    autor = sc.nextLine();
    System.out.print("Dime el número de páginas del libro: ");
    num_paginas = Integer.parseInt(sc.nextLine());
    System.out.print("Dime el precio del libro: ");
    precio = Double.parseDouble(sc.nextLine());
    sc.close();

    // mostrar datos
    System.out.println("El libro ingresado es: " + titulo);
    System.out.println("sus datos son:" + autor + ", " + 
    num_paginas + ", " + precio);

}
}
