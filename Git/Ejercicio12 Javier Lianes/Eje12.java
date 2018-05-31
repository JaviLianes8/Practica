/*EJERCICIO DE FUNCIONES
Se quiere desarrollar un programa que permita trabajar con puntos 2D (puntos en el plano
representados por las coordenadas X e Y). Las operaciones que se pueden realizar sobre los puntos
son:
1. Inicializar punto. Función que recibe dos puntos enteros X e Y y establece las coordenadas del
punto.
2. Leer coordenada X. función que devuelve la coordenada X del punto.
3. Leer coordenada Y. Función que devuelve la coordenada Y del punto.
4. Cálculo del cuadrante. Función que devuelve un String que indica el cuadrante en el que se
encuentra el punto (primero, segundo, tercero 0 cuarto). El cuadrante de un punto, respecto del
eje de coordenadas, se calcula de la siguiente forma:
a. primero: si X >= 0 e Y >= 0
b. segundo: si x < 0 e Y > 0
c. tercero: si X < 0 e Y < 0
d. cuarto: X >= 0 e Y <0
e. Eje X positivo: si X = 0 e Y > 0
f. Eje X negativo: si X = 0 e Y < 0
g. Eje Y positivo: si Y = 0 y X > 0
h. Eje Y negativo: si Y = 0 y X < 0
5. Cálculo del punto medio de un punto. Se calcula aplicando lo siguiente:
Xm = (X1 + X2)/2
Ym = (Y1 + Y2)/2
6. Distancia entre dos puntos. Se calcula con D = raíz cuadrada de ((X1 - X0) 2+ (Y2 - Y0)2)
Diseña las funciones y el programa de prueba*/
import java.util.Scanner;
import java.lang.*;
public class Eje12{
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        //Limpiar consola
        System.out.println('\u000C');
        //Declaramos las variables
        do{
            int arrayX [] = pedirarray(1);
            int arrayY [] = pedirarray(2);
            int puntox = PedirValor(1);
            int puntoy = PedirValor(2);
            System.out.println("El cuadrante es: " + CalculoCuadrante(puntox,puntoy));
            System.out.println("La distancia es: " + Distancia(arrayX[0],arrayX[1],arrayY[0],arrayY[1]));
            System.out.println("El punto medio de x es: " + CalculoMedio(arrayX[0],arrayX[1],arrayY[0],arrayY[1],1));
            System.out.println("El punto medio de y es: " + CalculoMedio(arrayX[0],arrayX[1],arrayY[0],arrayY[1],2));
        }while (terminar());
        System.out.println("Hasta pronto!");
    }
    //Pedir valor
    public static int PedirValor(int aux){
        Scanner leer = new Scanner(System.in);
        int resultado;
        System.out.println("Funcion para saber el cuadrante de un punto");
        if (aux == 1){
            System.out.println("Introduce el valor de X");
            resultado = leer.nextInt();
        }
        else{
            System.out.println("Introduce el valor de Y");
            resultado = leer.nextInt();
        }
        return resultado;
    }
    //Pedir valor
    public static int[] pedirarray(int aux){
        Scanner leer = new Scanner(System.in);
        int resultado;
        int array[] = new int [2];
        if (aux == 1){
            System.out.println("Introduce los valores del punto X");
            for (int i = 0; i<2; i++){
                System.out.println("Introduce el valor X" + (i+1));
                array[i] = leer.nextInt();
            }
        }
        else{
            System.out.println("Introduce los valores del punto Y");
            for (int i = 0; i<2; i++){
                System.out.println("Introduce el valor X" + (i+1));
                array[i] = leer.nextInt();
            }
        }
        return array;
    }
    //Calcular cuadrante
    public static String CalculoCuadrante(int x, int y){
        if (x>=0 && y>0){
            return "Primer cuadrante";
        }   else if (x<0 && y>0){
            return "Segundo cuadrante";
        }   else if (x<0 && y<0){
            return "Tercer cuadrante";
        }   else if (x>=0 && y<0){
            return "Cuarto cuadrante";
        }   else if (x==0 && y>0){
            return "Eje X positivo";
        }   else if (x==0 && y<0){
            return "Eje X negativo";
        }   else if (y==0 && x>0){
            return "Eje Y positivo";
        }   else if (y==0 && x<0){
            return "Eje Y negativo";
        }
        else{
            return "Parametros incorrectos";
        }
    }
    //  5. Cálculo del punto medio de un punto. Se calcula aplicando lo siguiente: Xm = (X1 + X2)/2      Ym = (Y1 + Y2)/2
    public static int CalculoMedio(int x1, int x2, int y1, int y2, int num){
        Scanner leer = new Scanner(System.in);
        int resultado;
        if (num == 1){
            resultado = (x1 + x2)/2;
        }
        else{
            resultado = (y1 + y2)/2;
        }
        return resultado;
    }
    //6. Distancia entre dos puntos. Se calcula con D = raíz cuadrada de D = raíz cuadrada de ((X1 - X0)alcuadrado+ (Y2 - Y0)alcuadrado) 
    public static double Distancia(int x1, int x2, int y1, int y2){
        Scanner leer = new Scanner(System.in);
        double resultado = Math.sqrt((x1-x2)*(x1+x2)+(y1-y2)*(y1-y2));
        //resultado = Math.sqrt(Math.pow(x-y));
        return resultado;
    }
    //Función para seguir o no
    public static boolean terminar(){
        Scanner leer = new Scanner(System.in);
        char salir;
        do{
            System.out.println("Quieres seguir? (s/n)");
            salir = leer.next().charAt(0);
        }while(salir !='s'&& salir != 'n');
        if (salir == 's'){
            return true;
        }
        return false;
    }
}