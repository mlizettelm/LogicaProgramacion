package old;
void main(){
int base;
int altura;
int area;
String dato;

dato = IO.readln("Ingrese la base del rectángulo: ");
base = Integer.parseInt(dato);

dato = IO.readln("Ingrese la altura del rectángulo: ");
altura = Integer.parseInt(dato);

area = base * altura;
IO.println("El área del rectángulo es: " + area);

}
