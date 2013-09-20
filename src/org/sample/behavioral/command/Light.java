package org.sample.behavioral.command;

public class Light {
    private boolean condition;
    
    public void switchOn(){
        condition = true;
    }
    
    public void switchOff(){
        condition = false;
    }
}
