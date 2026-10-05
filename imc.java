public class imc {
    public static void main(String[] args){
        int edad;

        final int MAYORIA_EDAD = 18;

        edad = Integer.parseInt(IO.readln("Escribe tu edad: "));


        if(edad >= MAYORIA_EDAD){

            IO.println("Felicidades, eres mayor de edad, adelante!");
        }

        else {

            IO.println("Lo siento pequeño, no puedes continuar.");

        }
        char respuesta;
        do {
            // Calcular el IMC 
            /* El Índice de Masa Corporal (IMC) 
            se calcula dividiendo el peso en kilogramos 
            entre el cuadrado de la estatura en metros (IMC = kg / m²)
            */

            // Datos de entrada: peso y estatura

            double peso = Double.parseDouble(IO.readln("Ingresa tu peso en Kg:"));

            double estatura = Double.parseDouble(IO.readln("Ingresa tu estatura en metros:"));

            double imc = peso / Math.pow(estatura,2);

            IO.println("Tu índice de masa corporal es:" + imc);

            // Clasificar el grado de obesidad 
            /*
            • Sobrepeso: IMC de 25.0 a 29.9
            • Obesidad grado I (moderada): IMC de 30.0 a 34.9
            • Obesidad grado II (severa): IMC de 35.0 a 39.9
            • Obesidad grado III (mórbida o extrema): IMC igual o mayor a 40.0
            */

            int grado=-1;

            if (imc >= 40) {
                IO.println("Tu grado de obesidad es III (Mórbida o Extrema).");
                grado = 3;
            } else if (imc >= 35) {
                IO.println("Tu grado de obesidad es II (Severa).");
                grado = 2;
            } else if (imc >= 30) {
                IO.println("Tu grado de obesidad es I (Moderada).");
                grado = 1;
            } else if (imc >= 25) {
                IO.println("Tu grado de obesidad es Sobrepeso.");
                grado = 0;
            } else {
                IO.println("Tu IMC está dentro de un rango saludable.");
            }

            // escribir plan de accion usando switch, case, break.

            switch (grado) {
                case 0:
                    IO.println("Tu plan de acción incluye: ");
                    break;
                case 1:
                    IO.println("Tu plan de acción incluye: ");
                    break;
                case 2:
                    IO.println("Tu plan de acción incluye:");
                    break;
                case 3:
                    IO.println("Tu plan de acción incluye:");
                    break;
                default:
                    IO.println("Tu plan de acción incluye:");
                    break;
            }
            respuesta = IO.readln("¿Deseas calcular otro IMC ? (s/n): ").trim().charAt(0);
        }while(Character.toLowerCase(respuesta) == 's');

    }
}
