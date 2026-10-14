import java.util.Scanner;

public class ventasPaleteria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] sabores = {"Fresa", "Limón", "Coco"};
        int[] precios = {15, 12, 18};

        int dineroTotal = 0;

        for (int dia = 1; dia <= 2; dia++) {
            int dineroDelDia = 0;

            System.out.println("\nDía " + dia);

            for (int sabor = 0; sabor < sabores.length; sabor++) {
                System.out.print(
                    "¿Cuántas paletas de " + sabores[sabor] + " se vendieron? "
                );

                int cantidad = entrada.nextInt();
                dineroDelDia += cantidad * precios[sabor];
            }

            System.out.println("Recaudación del día: $" + dineroDelDia);
            dineroTotal += dineroDelDia;
        }

        System.out.println("\nRecaudación total de los dos días: $" + dineroTotal);

        entrada.close();
    }
}