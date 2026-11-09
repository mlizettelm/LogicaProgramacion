import java.util.Scanner;

public class vta_vivero {
    public static void main(String[] args){
        final int DIAS_SEMANA = 6;
        
        // Arreglos de productos y precios
        String[] productos = {"Cactus", "Suculenta", "Maceta", "Tierra", "Fertilizante"};
        double[] precios = {45.50, 35.50, 60.0, 80.0, 95.0};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

        // Matriz para guardar las ventas de la semana
        double[][] ventas = new double[productos.length][DIAS_SEMANA];

        Scanner scanner = new Scanner(System.in);


        double monto_venta = 0.0;
        int unidades_vendidas = 0;

        for (int dia = 0; dia < DIAS_SEMANA; dia++) {

            System.out.println("Día " + dias[dia] + ":");
            for (int i = 0; i < productos.length; i++) {
                System.out.print("Dime la cantidad de " + productos[i] + " vendida: ");
                unidades_vendidas = Integer.parseInt(scanner.nextLine());
                monto_venta = unidades_vendidas * precios[i];
                ventas[i][dia] = monto_venta;
            }
        }
        scanner.close();
        // Reporte de ventas semanal
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i]);
            double total_producto = 0;
            for (int dia = 0; dia < DIAS_SEMANA; dia++) {
                total_producto += ventas[i][dia];
            }
            System.out.println("Total vendido: " + total_producto);
        }
    }
}
