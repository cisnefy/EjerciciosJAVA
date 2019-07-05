package com.investigacion.patrones.comportamiento.observer;

/**
 *
 * Tomado de: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public class OctalObserver extends Observer{
    
    public OctalObserver(Subject subject){
    
        this.subject = subject;
        this.subject.attach(this);
    }
    
    public void update(){
    
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
    
}
