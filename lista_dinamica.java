import java.util.ArrayList;

public class lista_dinamica {
    public static void main(String[] args) {
    // Implementation for dynamic list
    ArrayList<Double> calificaciones = new ArrayList<>();
    String respuesta;

    do {
        double calificacion;

        do {
            calificacion = Double.parseDouble(
                IO.readln("Ingresa una calificación entre 0 y 100: ")
            );

            if (calificacion < 0 || calificacion > 100) {
                IO.println("La calificación debe estar entre 0 y 100.");
            }

        } while (calificacion < 0 || calificacion > 100);

        calificaciones.add(calificacion);

        do {
            respuesta = IO.readln(
                "¿Deseas registrar otra calificación? (s/n): "
            ).trim();

            if (!respuesta.equalsIgnoreCase("s")
                    && !respuesta.equalsIgnoreCase("n")) {
                IO.println("Escribe solamente s o n.");
            }

        } while (!respuesta.equalsIgnoreCase("s")
                && !respuesta.equalsIgnoreCase("n"));

    } while (respuesta.equalsIgnoreCase("s"));

    double suma = 0;

    for (int i = 0; i < calificaciones.size(); i++) {
        double calificacion = calificaciones.get(i);

        IO.println("Calificación " + (i + 1) + ": " + calificacion);
        suma += calificacion;
    }

    double promedio = suma / calificaciones.size();

    IO.println("Cantidad de calificaciones: " + calificaciones.size());
    IO.println("Promedio: " + promedio);


    }
}
