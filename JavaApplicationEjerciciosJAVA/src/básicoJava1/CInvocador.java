package básicoJava1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author cisnefy
     * Clase CInvocador que actúa como un objeto invocador.
 */
public class CInvocador {

    private List<IOrden> listaDeOrdenes = new ArrayList<IOrden>();

    public void tomarOrden(IOrden orden) {

        listaDeOrdenes.add(orden);
    }

    public void hacerPedidos() {

        for (IOrden orden : listaDeOrdenes) {

            orden.ejecutar();
        }
        listaDeOrdenes.clear();
    }

}
