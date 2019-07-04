package básicoJava2;

/**
 *
 * @tomado de:
 * https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
 */
public class NumeroMayorApp {

    public static void main(String[] args) {
        
        ModeloNumeroMayor model = traerNumerosDeLaBaseDeDatos();
        
        VistaNumeroMayor view = new VistaNumeroMayor();
        
        ControladorNumeroMayor controller = new ControladorNumeroMayor(model, view);
        
        controller.actualizarVista();
        
        controller.setModeloNumeroI(3);
        
        controller.actualizarVista();
        
        controller.setModeloNumeroI(5);
        
        controller.actualizarVista();
    }

    private static ModeloNumeroMayor traerNumerosDeLaBaseDeDatos() {

        ModeloNumeroMayor modelNumero = new ModeloNumeroMayor();
        modelNumero.setNumeroI(7);
        modelNumero.setNumeroII(5);
        return modelNumero;
    }

}
