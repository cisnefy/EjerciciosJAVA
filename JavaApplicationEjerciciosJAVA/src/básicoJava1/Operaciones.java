package básicoJava1;

/**
 *
 * @tomado de:
 * https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
 */
public class Operaciones {

    public static void main(String[] arg) {

        CSolicitud solicitud = new CSolicitud();

        CSolicitudSumar ordenSolicitaSuma = new CSolicitudSumar(solicitud);
        CSolicitudRestar ordenSolicitaResta = new CSolicitudRestar(solicitud);
        CSolicitudMultiplicar ordenSolicitaMultiplicacion = new CSolicitudMultiplicar(solicitud);
        CSolicitudDividir ordenSolicitaDivision = new CSolicitudDividir(solicitud);
        CSolicitudModulo ordenSolicitaModulo = new CSolicitudModulo(solicitud);

        CInvocador invocador = new CInvocador();

        invocador.tomarOrden(ordenSolicitaSuma);
        invocador.tomarOrden(ordenSolicitaResta);
        invocador.tomarOrden(ordenSolicitaMultiplicacion);
        invocador.tomarOrden(ordenSolicitaDivision);
        invocador.tomarOrden(ordenSolicitaModulo);

        invocador.hacerPedidos();
    }

}
