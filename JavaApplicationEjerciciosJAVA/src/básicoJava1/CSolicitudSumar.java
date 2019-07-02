package básicoJava1;

/**
 *
 * @author cisnefy
 * @version 1
 * CSolicitudSumar es una clase concreta de comando que
 * implementa la interfaz IOrden que hará el procesamiento
 * del comando real.
 */
public class CSolicitudSumar implements IOrden {

    private CSolicitud suma;

    public CSolicitudSumar(CSolicitud suma) {

        this.suma = suma;
    }

    @Override
    public void ejecutar() {

        suma.sumar();
    }

}
