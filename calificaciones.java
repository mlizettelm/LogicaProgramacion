public class calificaciones {
    public static void main(String[] args ) {
    double[] calificaciones = new double[5];
    double suma = 0;

    // Capturar y guardar las calificaciones.
    for (int i = 0; i < calificaciones.length; i++) {
        calificaciones[i] = Double.parseDouble(
            IO.readln("Ingresa la calificación " + (i + 1) + ": ")
        );

        suma += calificaciones[i];
    }

    double promedio = suma / calificaciones.length;

    IO.println("Promedio: " + promedio);
    IO.println("Calificaciones por encima del promedio:");

    // Consultar los datos que guardamos.
    for (int i = 0; i < calificaciones.length; i++) {
        if (calificaciones[i] > promedio) {
            IO.println(
                "Calificación " + (i + 1) + ": " + calificaciones[i]
            );
        }
    }
}
}
