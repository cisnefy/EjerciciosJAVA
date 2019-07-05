package EjemploHilo2Contadores;

/**
 *
 * tomado de disco duro de roer
 */
public class Contador implements Runnable {

    private int contador;
    private String nombreHilo;
    private int limiteContador;

    public Contador(String nombreHilo, int limiteContador) {
        this.contador = 0;
        this.nombreHilo = nombreHilo;
        this.limiteContador = limiteContador;
    }

    @Override
    public void run() {

        while(contador <= limiteContador) {
            
            System.out.println("Hilo: " + nombreHilo + " "+contador);
            contador++;
        }
        System.out.println("Hilo:"+nombreHilo+" ha finalizado!");
    }

}
