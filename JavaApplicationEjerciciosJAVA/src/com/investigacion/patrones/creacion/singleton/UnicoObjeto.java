package com.investigacion.patrones.creacion.singleton;

/**
 *
 * @author Tomado de:
 * https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 */
public class UnicoObjeto {

    private static UnicoObjeto instance = new UnicoObjeto();

    private UnicoObjeto() {
    }

    public static UnicoObjeto getInstance() {

        return instance;
    }

    public void showMessage() {

        System.out.println("Hola mundo!");
    }

}
