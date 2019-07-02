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
public class CSolicitudModulo implements IOrden{
    
    private CSolicitud modulo;
    
    public CSolicitudModulo(CSolicitud modulo){
    
        this.modulo = modulo;
    }
    
    public void ejecutar(){
    
        modulo.restoDeDivision();
    }
}
