package numerosJava4;

/**
 *
 * @author cisnefy
 */
public class Numeros {
    
    private double numero1;
    private double numero2;
    private String resultado;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public String getNumeroMayor(){
    
         if (numero1 > numero2) {

            resultado = (numero1 + " es mayor que: " + numero2);
        } else if (numero1 < numero2) {
            resultado = (numero1 + " es menor que: " + numero2);
        } else if (numero1 == numero2) {

            resultado = (numero1 + " es igual a: " + numero2);
        }
        return resultado;
    }
    
    public String getSuma(){
        
        return resultado = "La suma de: "+numero1+" + "+numero2+" es igual a: "+(numero1+numero2);
    }
    
    public String getResta(){
    
        return resultado = "La resta de: "+numero1+" - "+numero2+" es igual a: "+(numero1-numero2);
    }
    public String getMultiplicacion(){
    
        return resultado = "La multiplicación de: "+numero1+" * "+numero2+" es igual a: "+(numero1*numero2);
    }
    
    public String getDivision(){
    
        return resultado = "La division de: "+numero1+" / "+numero2+" es igual a: "+(numero1/numero2);
    }
    
    public String getModulo(){
    
        return resultado = "El modulo de: "+numero1+" % "+numero2+" es igual a: "+(numero1%numero2);
    }
    
}
