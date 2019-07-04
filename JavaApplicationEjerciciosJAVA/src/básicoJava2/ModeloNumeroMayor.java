package básicoJava2;

/**
 *
 * @author cisnefy
 */
public class ModeloNumeroMayor {

    private double numeroI;
    private double numeroII;
    private String resultado;

    public double getNumeroI() {
        return numeroI;
    }

    public void setNumeroI(double numeroI) {
        this.numeroI = numeroI;
    }

    public double getNumeroII() {
        return numeroII;
    }

    public void setNumeroII(double numeroII) {
        this.numeroII = numeroII;
    }

    public String getNumeroMayor() {

        if (numeroI > numeroII) {

            resultado = (numeroI + " es mayor que: " + numeroII);
        } else if (numeroI < numeroII) {
            resultado = (numeroI + " es menor que: " + numeroII);
        } else if (numeroI == numeroII) {

            resultado = (numeroI + " es igual a: " + numeroII);
        }
        return resultado;
    }

}
