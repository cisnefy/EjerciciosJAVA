package calculadoraJava;

/**
 *
 * @author cisnefy
 */
public class CalculadoraView {
    
    public void printOperacionesCalculadora(double numero1, double numero2, String resultadoSuma, String resultadoResta, String resultadoMultiplicacion, String resultadoDivision, String resultadoModulo){
    
        System.out.println("Calculadora con las siguientes operaciones básicas:");
        System.out.println("primer  número: "+numero1);
        System.out.println("segundo número: "+numero2);
        System.out.println(resultadoSuma);
        System.out.println(resultadoResta);
        System.out.println(resultadoMultiplicacion);
        System.out.println(resultadoDivision);
        System.out.println(resultadoModulo);
        System.out.println("___________________________________________________");
    }
    
}
