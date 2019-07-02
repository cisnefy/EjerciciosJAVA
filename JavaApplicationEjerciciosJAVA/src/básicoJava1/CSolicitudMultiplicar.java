package básicoJava1;

/**
 *
 * @author cisnefy
 */
public class CSolicitudMultiplicar implements IOrden {

    private CSolicitud multiplica;

    public CSolicitudMultiplicar(CSolicitud multiplica) {

        this.multiplica = multiplica;
    }

    public void ejecutar() {

        multiplica.multiplicar();
    }

}
