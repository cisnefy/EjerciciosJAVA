package ejercicioCuenta;

/**
 *
 * @author cisnefy
 */
public class CuentaApp {

    public static void main(String[] args) {

        Cuenta model1 = getDatosCuentaFromDataBase("Petronilo");
        Cuenta model2 = getDatosCuentaFromDataBase("Panfilo", 300);
        CuentaView view = new CuentaView();

        CuentaController controller1 = new CuentaController(model1, view);
        CuentaController controller2 = new CuentaController(model2, view);

        controller1.viewEstadoCuenta();
        controller2.viewEstadoCuenta();

        controller1.ingresarEnLaCuenta(300);
        controller2.ingresarEnLaCuenta(400);

        controller1.viewEstadoCuenta();
        controller2.viewEstadoCuenta();

        controller1.retirarDeLaCuenta(500);
        controller2.retirarDeLaCuenta(100);

        controller1.viewEstadoCuenta();
        controller2.viewEstadoCuenta();

    }

    private static Cuenta getDatosCuentaFromDataBase(String titular) {

        Cuenta cuenta = new Cuenta();

        cuenta.setTitular(titular);
        cuenta.setCantidad(0);
        return cuenta;
    }
    
    private static Cuenta getDatosCuentaFromDataBase(String titular, double cantidad) {

        Cuenta cuenta = new Cuenta();

        cuenta.setTitular(titular);
        cuenta.setCantidad(cantidad);
        return cuenta;
    }

}
