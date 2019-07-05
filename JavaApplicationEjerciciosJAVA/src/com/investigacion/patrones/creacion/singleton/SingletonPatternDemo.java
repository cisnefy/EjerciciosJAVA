package com.investigacion.patrones.creacion.singleton;

/**
 *
 * @author tomado de:
 * https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        UnicoObjeto objeto = UnicoObjeto.getInstance();

        objeto.showMessage();
    }

}
