package EjemploHiloThread1NumLetras;

/**
 *
 * Tomado de disco duro de roer youtube
 * Ejercicios Java - Thread #1 ¡Mostrando números y letras a la vez!
 */
public class Ejemplo1Hilos {
    
    public static void main(String[] args){
    
        HiloNumeroLetras h1 = new HiloNumeroLetras(1);
        HiloNumeroLetras h2 = new HiloNumeroLetras(2);
        
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        
        t1.start();
        t2.start();
    }
    
}
