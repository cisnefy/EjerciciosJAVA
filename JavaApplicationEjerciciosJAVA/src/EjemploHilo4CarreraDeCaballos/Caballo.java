package EjemploHilo4CarreraDeCaballos;

import java.util.Observable;

/**
 *
 * Tomado de disco duro de roer tema hilos thread
 */
public class Caballo extends Observable implements Runnable{
    
    private String nombre;
    
    public Caballo(String nombre){
    
        this.nombre = nombre;
    }

    @Override
    public void run() {
        
        int porcentaje = 0;
        
        while(porcentaje <= 100){}
        
    }
    
    public static int generaNumeroAleatorio(int minimo, int maximo){
    
        int num = (int)Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
    
}
