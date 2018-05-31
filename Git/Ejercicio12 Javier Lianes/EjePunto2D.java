public class EjePunto2D{
    public static void main(String[]args){
        //Limpiar consola
        System.out.println('\u000C');
        Punto2D uno = new Punto2D(2,3);
        Punto2D dos = new Punto2D(-2,3);
        System.out.println("El cuadrante del punto 1 es: " + uno.CalcularCuadrante());
        System.out.println("El cuadrante del punto 2 es: " + dos.CalcularCuadrante());
        System.out.println("El punto medio es: " + uno.puntomedio(dos));
    }
}