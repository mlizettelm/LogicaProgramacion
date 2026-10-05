public class alcance {
    public static void main(String[] args){
    
    int cantidad = 3;

        for (int i = 1; i <= cantidad; i++) {
            double precio = Double.parseDouble(
                IO.readln("Ingresa el precio: ")
            );

            IO.println(precio);
            IO.println(cantidad);
        }

        IO.println(cantidad); // Válido.
        IO.println(i);        // Error: i pertenece al for.
        IO.println(precio);   // Error: precio pertenece al cuerpo del for.
    
    }
    
}
