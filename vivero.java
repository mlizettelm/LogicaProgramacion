
import java.util.Scanner;

public class vivero {

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n--- VIVERO ---");
        System.out.println("1. Consultar inventario");
        System.out.println("2. Registrar venta");
        System.out.println("3. Reporte final de ventas");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
    }

    // Método para mostrar el inventario
    public static void mostrarInventario(String[][] inventario) {

        System.out.println("\n--- INVENTARIO ---");

        for (int i = 0; i < inventario.length; i++) {

            System.out.print(inventario[i][0] + " - ");
            System.out.print(inventario[i][1] + " - $");
            System.out.print(inventario[i][2] + " - ");
            System.out.print(inventario[i][3] + " unidades");

            if (Integer.parseInt(inventario[i][3]) == 0) {
                System.out.print(" AGOTADO");
            }

            System.out.println();
        }
    }

    // Método que calcula y regresa un importe
    public static double calcularImporte(double precio,
                                         int cantidad) {
        return precio * cantidad;
    }

    // Método para registrar una venta
    public static int registrarVenta(
            String[][] inventario,
            int[][] ventas,
            int totalVentas,
            Scanner sc) {

        mostrarInventario(inventario);

        System.out.print("\nCódigo del producto: ");
        int codigo = sc.nextInt();

        if (codigo < 1 || codigo > inventario.length) {
            System.out.println("Código inválido");
            return totalVentas;
        }

        int indice = codigo - 1;

        int existencia = Integer.parseInt(
            inventario[indice][3]
        );

        if (existencia == 0) {
            System.out.println("Producto agotado");
            return totalVentas;
        }

        if (totalVentas >= ventas.length) {
            System.out.println("Historial de ventas lleno");
            return totalVentas;
        }

        System.out.print("Cantidad a vender: ");
        int cantidad = sc.nextInt();

        if (cantidad <= 0 || cantidad > existencia) {
            System.out.println("Cantidad inválida");
            return totalVentas;
        }

        // Actualizar inventario
        existencia = existencia - cantidad;

        inventario[indice][3] = String.valueOf(existencia);

        // Registrar venta en la matriz
        ventas[totalVentas][0] = codigo;
        ventas[totalVentas][1] = cantidad;

        totalVentas++;

        double precio = Double.parseDouble(
            inventario[indice][2]
        );

        double importe = calcularImporte(precio, cantidad);

        System.out.println("Venta registrada");
        System.out.printf("Importe: $%.2f%n", importe);

        return totalVentas;
    }

    // Método para generar el reporte
    public static void mostrarReporte(
            String[][] inventario,
            int[][] ventas,
            int totalVentas) {

        System.out.println("\n--- REPORTE DE VENTAS ---");

        if (totalVentas == 0) {
            System.out.println("Aún no hay ventas registradas");
        }

        int unidadesVendidas = 0;
        double dineroRecaudado = 0;

        for (int i = 0; i < totalVentas; i++) {

            int codigo = ventas[i][0];
            int cantidad = ventas[i][1];

            int indice = codigo - 1;

            double precio = Double.parseDouble(
                inventario[indice][2]
            );

            unidadesVendidas += cantidad;

            dineroRecaudado += calcularImporte(
                precio, cantidad
            );
        }

        System.out.println("Ventas registradas: " + totalVentas);
        System.out.println("Unidades vendidas: " + unidadesVendidas);
        System.out.printf("Dinero recaudado: $%.2f%n",
                          dineroRecaudado);

        System.out.println("\nProductos agotados:");

        boolean hayAgotados = false;

        for (int i = 0; i < inventario.length; i++) {

            int existencia = Integer.parseInt(
                inventario[i][3]
            );

            if (existencia == 0) {
                System.out.println(inventario[i][1]);
                hayAgotados = true;
            }
        }

        if (!hayAgotados) {
            System.out.println("Ninguno");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matriz de inventario
        String[][] inventario = {
            {"1", "Cactus", "45", "20"},
            {"2", "Suculenta", "35", "15"},
            {"3", "Maceta", "60", "12"},
            {"4", "Tierra preparada", "80", "10"},
            {"5", "Fertilizante", "95", "8"}
        };

        // Matriz para almacenar hasta 100 ventas
        int[][] ventas = new int[100][2];

        int totalVentas = 0;
        int opcion;

        do {

            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    mostrarInventario(inventario);
                    break;

                case 2:
                    totalVentas = registrarVenta(
                        inventario, ventas, totalVentas, sc
                    );
                    break;

                case 3:
                    mostrarReporte(
                        inventario, ventas, totalVentas
                    );
                    break;

                case 4:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
