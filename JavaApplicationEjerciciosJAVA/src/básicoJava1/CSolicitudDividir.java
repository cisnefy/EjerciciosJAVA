/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package básicoJava1;

/**
 *
 * @author cisnefy
 */
public class CSolicitudDividir implements IOrden{
    
    private CSolicitud divide;
    
    public CSolicitudDividir(CSolicitud divide){
    
        this.divide = divide;
    }
    
    public void ejecutar(){
    
        divide.dividir();
    }
    
}
