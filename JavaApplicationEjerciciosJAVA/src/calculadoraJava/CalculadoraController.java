package calculadoraJava;

/**
 *
 * @author cisnefy
 */
public class CalculadoraController {
    
    private Calculadora modelo;
    private CalculadoraView vista;

    public CalculadoraController(Calculadora modelo, CalculadoraView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public double getModeloNumero1() {
        return modelo.getNumero1();
    }

    public void setModeloNumero1(double numero1) {
        modelo.setNumero1(numero1);
    }

    public void setModeloNumero2(double numero2) {
        modelo.setNumero2(numero2);
    }

    public double getModeloNumero2() {
        return modelo.getNumero2();
    }
    
    public void actualizarVista(){
    
        vista.printOperacionesCalculadora(modelo.getNumero1(), modelo.getNumero2(), modelo.getSuma(), modelo.getResta(), modelo.getMultiplicacion(), modelo.getDivision(), modelo.getModulo());
    }
    
}
