package numerosJava4;

/**
 *
 * @author cisnefy
 */
public class NumerosApp {
    
    public static void main(String[] args){
    
        Numeros model = getNumbersFromDataBase();
        NumeroMayorView view1 = new NumeroMayorView();
        OperacionesBasicasView view2 = new OperacionesBasicasView();
        NumerosController controller = new NumerosController(model, view1, view2);
        controller.view1();
        controller.view2();
    }

    private static Numeros getNumbersFromDataBase() {
        
        Numeros modelo = new Numeros();
        modelo.setNumero1(3);
        modelo.setNumero2(2);
        return modelo;
    }
}
