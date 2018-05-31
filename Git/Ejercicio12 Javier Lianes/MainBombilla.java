import java.util.Scanner;
public class MainBombilla{
    public static void main(String[]args){
        //Limpiar consola
        System.out.println('\u000C');

        Bombilla BombillaDormitorio = new Bombilla();
        Bombilla BombillaSalon = new Bombilla();
        Bombilla BombillaCocina = new Bombilla();
        int numeromenu, contador = 0;

        do{
            numeromenu = Continuar(contador);
            menu(BombillaDormitorio, BombillaSalon,BombillaCocina, numeromenu);
        } while (numeromenu != 10);
        System.out.println("Hasta pronto mongolin");

    }
    //Sirve para elegir un numero en el swith case o salir
    public static int Continuar(int contador){
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Encender habitación");
        System.out.println("2. Encender salón");
        System.out.println("3. Encender cocina");
        System.out.println("4. Apagar Habitación");
        System.out.println("5. Apagar salón");
        System.out.println("6. Apagar Cocina");
        System.out.println("7. Activar interruptor general");
        System.out.println("8. Desactivar interruptor general");
        System.out.println("9. Consultar estado de las bombillas");
        System.out.println("10. salir");
        System.out.println("11. Crear bombilla prueba");
        int num = leer.nextInt();
        return num;
    }

    public static void menu(Bombilla BombillaDormitorio, Bombilla BombillaSalon, Bombilla BombillaCocina, int numeromenu){
        switch (numeromenu){

            case 1: //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está encendiendo la bombilla de la habitación");
            System.out.println("");
            BombillaDormitorio.Encender();
            break;

            case 2: //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está encendiendo la bombilla del salón");
            System.out.println("");
            BombillaSalon.Encender();
            break;

            case 3: 
            //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está encendiendo la bombilla de la cocina");
            System.out.println("");
            BombillaCocina.Encender();
            break;

            case 4: 
            //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está apagando la bombilla de la habitación");
            System.out.println("");
            BombillaDormitorio.Apagar();
            break;

            case 5: //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está apagando la bombilla del salón");
            System.out.println("");
            BombillaSalon.Apagar();
            break;

            case 6: 
            //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está apagando la bombilla de la cocina");
            System.out.println("");
            BombillaCocina.Apagar();
            break;

            case 7: 
            //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está activando el interruptor general");
            System.out.println("");
            Bombilla.ActivaGeneral();
            break;

            case 8: 
            //Limpiar consola
            System.out.println('\u000C');
            System.out.println("Se está desactivando el interruptor general");
            System.out.println("");
            Bombilla.DesactivaGeneral();
            break;

            case 9: 
            //Limpiar consola
            System.out.println('\u000C');
            if (BombillaDormitorio.estado() == true){
                System.out.println("La bombilla del dormitorio está on");
            }
            else{
                System.out.println("La bombilla del dormitorio está off");
            }
            if (BombillaSalon.estado() == true){
                System.out.println("La bombilla del salon está on");
            }
            else{
                System.out.println("La bombilla del salon está off");
            }
            if (BombillaCocina.estado() == true){
                System.out.println("La bombilla de la cocina está on");
            }
            else{
                System.out.println("La bombilla de la cocina está off");
            }
            System.out.println("");
            break;

            case 10: 
            //Limpiar consola
            System.out.println('\u000C');
            System.out.println("");
            break;

            case 11:
            //Limpiar consola
            System.out.println('\u000C');       
            Bombilla BombillaPrueba = new Bombilla();
            System.out.println("Partimos de la base de que nuestra bombilla prueba está apagada...");
            if (BombillaPrueba.estado() == true){
                System.out.println("Bombilla prueba on");
            }
            else {
                System.out.println("Bombilla prueba off");
            }
            System.out.println("Ahora encendemos el interruptor de nuestra bombilla prueba...");
            BombillaPrueba.Encender();
            
            if (BombillaPrueba.estado() == true){
                System.out.println("Bombilla prueba on");
            }
            else {
                System.out.println("Bombilla prueba off");
            }
            
            System.out.println("");
            break;

            default: System.out.println("Número erroneo");
            break;
        }
    }
}
