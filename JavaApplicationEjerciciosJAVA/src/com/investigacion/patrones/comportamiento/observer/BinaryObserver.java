package com.investigacion.patrones.comportamiento.observer;

/**
 *
 * Tomado de: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {

        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
