package EjemploHilo2Contadores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Tomado de disco duro de roer
 */
public class Ejercicio2HiloApp {

    public static void main(String[] args) {

        Contador c1 = new Contador("Contador 1", 40);
        Contador c2 = new Contador("Contador 2", 50);
        Contador c3 = new Contador("Contador 3", 20);
        Contador c4 = new Contador("Contador 4", 70);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
                
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio2HiloApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Fin del programa!");
    }

}
