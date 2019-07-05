package com.investigacion.patrones.comportamiento.observer;

/**
 *
 * Tomado de: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public abstract class Observer {
    
    protected Subject subject;
    
    public abstract void update();
    
}
