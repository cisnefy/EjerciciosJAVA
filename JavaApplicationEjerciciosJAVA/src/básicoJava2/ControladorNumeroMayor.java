package básicoJava2;

/**
 *
 * @author cisnefy
 */
public class ControladorNumeroMayor {

    private ModeloNumeroMayor model;
    private VistaNumeroMayor view;

    public ControladorNumeroMayor(ModeloNumeroMayor model, VistaNumeroMayor view) {

        this.model = model;
        this.view = view;
    }

    public void setModeloNumeroI(double numero1) {

        model.setNumeroI(numero1);
    }

    public double getModeloNumeroI() {

        return model.getNumeroI();
    }

    public void setModeloNumeroII(double numero2) {

        model.setNumeroII(numero2);
    }

    public double getModeloNumeroII() {

        return model.getNumeroII();
    }
    
    public void actualizarVista(){
    
        view.printNumeroMayor(model.getNumeroI(), model.getNumeroII());
    }

}
