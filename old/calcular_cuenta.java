package old;
void main() {
    String articulo, dato;
    int num_articulos;
    double costo_articulo, cuenta;

    articulo = IO.readln("Ingrese el nombre del artículo: ");
   
    dato = IO.readln("Ingrese la cantidad del mismo artículo: ");
    num_articulos = Integer.parseInt(dato);


    dato = IO.readln("Ingrese el costo del artículo: ");
    costo_articulo = Double.parseDouble(dato);

    cuenta = num_articulos * costo_articulo;

    IO.println("Tu cuenta del articulo " +articulo +  " es: " + cuenta);
}
