package com.investigacion.patrones.comportamiento.observer;

/**
 *
 * Tomado de: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("Primer cambio de estado: 15");
        subject.setState(15);
        System.out.println("Segundo cambio de estado: 10");
        subject.setState(10);
    }

}
