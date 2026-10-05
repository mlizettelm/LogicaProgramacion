public class alcance {
    public static void main(String[] args){
    
    int cantidad = 3;
    double precio = 0;  
    int num_iteraciones_totales = 0;

        for (int i = 1; i <= cantidad; i++) {
                precio = Double.parseDouble(
                IO.readln("Ingresa el precio: ")
            );


            IO.println(precio);
            IO.println(cantidad);
            num_iteraciones_totales= i;

        }

        IO.println(cantidad); // Válido.
        IO.println(num_iteraciones_totales);        // Error: i pertenece al for.
        IO.println(precio);   // Error: precio pertenece al cuerpo del for.
    
    }
    
}
