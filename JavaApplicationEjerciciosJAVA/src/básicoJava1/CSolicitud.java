package básicoJava1;

/**
 *
 * @author cisnefy Clase que actúa como una Solicitud
 */
public class CSolicitud {

    private double numero1 = 2;
    private double numero2 = 3;

    public void sumar() {

        double suma = (numero1 + numero2);

        System.out.println("La solicitud de Sumar:............. " + numero1 + " + " + numero2 + " es: " + suma);
    }

    public void restar() {

        double resta = (numero1 - numero2);

        System.out.println("La solicitud de restar:............ " + numero1 + " - " + numero2 + " es: " + resta);
    }

    public void multiplicar() {

        double multiplicacion = 0;

        for (int i = 1; i <= numero2; i++) {

            multiplicacion += numero1;
        }
        System.out.println("La Solicitud de multiplicar:....... " + numero1 + " * " + numero2 + " es: " + multiplicacion);
    }

    public void dividir() {

        double division = (numero1 / numero2);
        System.out.println("La solicitud de dividir:........... " + numero1 + " / " + numero2 + " es: " + division);
    }

    public void restoDeDivision() {

        double modulo = (numero1 % numero2);
        System.out.println("La solicitud Módulo de:............ " + numero1 + " % " + numero2 + " es: " + modulo);
    }
}
