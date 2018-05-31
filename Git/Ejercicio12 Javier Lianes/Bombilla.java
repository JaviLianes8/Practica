public class Bombilla{
    //Atributos
    private static boolean IntGen = false;
    private boolean IntPart;    
    //Constrcutor
    public Bombilla(){
        this.IntPart = false;
    }    
    //Método para activar los fusiles
    public static void ActivaGeneral(){
        IntGen = true;
    }
    //Método para desactivar los fusiles
    public static void DesactivaGeneral(){
        IntGen = false;
    }
    //Método para activar interruptor
    public void Encender(){
        this.IntPart = true;
    }
    //Método para desactivar los fusiles
    public void Apagar(){
        this.IntPart = false;
    }
    //Comprobar el estado de las bombilla
    public boolean estado(){
        return this.IntPart && IntGen;
    }
}