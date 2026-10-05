package old;
public class estructuras_control {
    public static void main(){
    
       String nombre_empleado = leerNombreEmpleado();
       IO.println("El nombre del empleado es: " + nombre_empleado);
    }

    private static String leerNombreEmpleado(){
        String n;

        n = IO.readln("Ingrese el nombre del empleado: ");

        return n;
    }
    
}
