package calculadoraJava;

/**
 *
 * @author cisnefy
 */
public class CalculadoraApp {
    
    public static void main(String[] args){
    
        Calculadora model = traerNumerosDeLaBaseDeDatos();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);
        controller.actualizarVista();
        controller.setModeloNumero2(4);
        controller.actualizarVista();
    }

    private static Calculadora traerNumerosDeLaBaseDeDatos() {
        
        Calculadora modelo = new Calculadora();
        modelo.setNumero1(3);
        modelo.setNumero2(2);
        return modelo;
    }
    
}
