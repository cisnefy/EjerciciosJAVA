package básicoJava2;

/**
 *
 * @tomado de:
 * https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
 */
public class NumeroMayorApp {

    public static void main(String[] args) {

        double numeroI = 7;
        double numeroII = 5;

        if (numeroI > numeroII) {

            System.out.println(numeroI + " es mayor que: " + numeroII);
        } else if (numeroI < numeroII) {
            System.out.println(numeroI + " es menor que: " + numeroII);
        } else if (numeroI == numeroII) {

            System.out.println(numeroI + " es igual a: " + numeroII);
        }
    }

}
