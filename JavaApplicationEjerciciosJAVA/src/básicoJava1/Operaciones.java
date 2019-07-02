package básicoJava1;

/**
 *
 * @tomado de:
 * https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
 */
public class Operaciones {

    public static void main(String[] arg) {

        double numero1 = 2;
        double numero2 = 3;
        double multiplicacion = 0;

        double suma = (numero1 + numero2);
        double resta = (numero1 - numero2);

        for (int i = 1; i <= numero2; i++) {

            multiplicacion += numero1;
        }

        double division = (numero1 / numero2);
        double modulo = (numero1 % numero2);

        System.out.println("Suma de:............. " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta de:............ " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación de:... " + numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println("División de:......... " + numero1 + " / " + numero2 + " = " + division);
        System.out.println("Módulo de:........... " + numero1 + " % " + numero2 + " = " + modulo);
    }

}
