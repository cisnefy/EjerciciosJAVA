package ejercicioCuenta;

/**
 *
 * @author cisnefy
 */
public class CuentaController {
    
    private Cuenta model;
    private CuentaView view;      

    public CuentaController(Cuenta model, CuentaView view) {
        this.model = model;
        this.view = view;
        if (this.model.getCantidad() < 0) {
            this.model.setCantidad(0);
        } else {
            this.model.setCantidad(model.getCantidad());
        }
    }    
    
    public void setCuentaTitular(String titular){
    
        model.setTitular(titular);
    }
    
    public String getCuentaTitular(){
    
        return model.getTitular();
    }
    
    public void setCuentaCantidad(double cantidad){
    
        model.setCantidad(cantidad);
    }
    
    public double getCuentaCantidad(){
    
        return model.getCantidad();
    }
    
    public void ingresarEnLaCuenta(double cantidad){
    
        model.ingresar(cantidad);
    }
    
    public void retirarDeLaCuenta(double cantidad){
    
        model.retirar(cantidad);
    }
    
    public void viewEstadoCuenta(){
    
        view.printCuenta(model.toString());
    }
    
}
