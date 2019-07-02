package básicoJava1;

/**
 *
 * @author cisnefy 
 * CSolicitudRestar es una clase concreta de comando que
 * implementa la interfaz IOrden, que hará el procesamiento del comando real.
 */
public class CSolicitudRestar implements IOrden {

    private CSolicitud resta;

    public CSolicitudRestar(CSolicitud resta) {

        this.resta = resta;
    }

    @Override
    public void ejecutar() {

        resta.restar();

    }

}
