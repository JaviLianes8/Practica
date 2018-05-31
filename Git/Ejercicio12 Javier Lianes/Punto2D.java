public class Punto2D{
    int x;
    int y;

    //Método dar valor
    public void darvalor(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Método dar valor x
    public int leerCoordenadaX(){
        return this.x;
    }
    //Método dar valor y
    public int leerCoordenadaY(){
        return this.y;
    }
    //Metodo calcular cuadrante
    public int CalcularCuadrante(){
        if(x>=0 && y >=0) return 1;
        if(x<0 && y >=0) return 2;
        if(x<0 && y<0) return 3;
        return 4;
    }
    //constructor que recibe coordenadas del punto
    public Punto2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Conostructor que crea un punto a partir de otro
    public Punto2D(Punto2D p){
        thi
		s.x = p.leerCoordenadaX();
        this.y = p.leerCoordenadaY();
    }
    //Puto medio
    public int CrearPuntoX(){
        return 0;
    }
}