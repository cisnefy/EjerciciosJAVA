package numerosJava4;

/**
 *
 * @author cisnefy
 */
public class NumerosController {
    
    private Numeros model;
    private NumeroMayorView view1;
    private OperacionesBasicasView view2;

    public NumerosController(Numeros model, NumeroMayorView view1, OperacionesBasicasView view2) {
        this.model = model;
        this.view1 = view1;
        this.view2 = view2;
    }
    
    public void setNumerosNumero1(double numero1){
    
        model.setNumero1(numero1);
    }
    
    public double getNumerosNumero1(){
    
        return model.getNumero1();
    }
    
    public void setNumerosNumero2(double numero2){
    
        model.setNumero2(numero2);
    }
    
    public double getNumerosNumero2(){
    
        return model.getNumero2();
    }
    
    public void view1(){
    
        view1.printNumeroMayor(model.getNumero1(), model.getNumero2(), model.getNumeroMayor());
    }
    
    public void view2(){
    
        view2.printOperacionesBasicas(model.getNumero1(), model.getNumero2(), model.getSuma(), model.getResta(), model.getMultiplicacion(), model.getDivision(), model.getModulo());
    }
}
