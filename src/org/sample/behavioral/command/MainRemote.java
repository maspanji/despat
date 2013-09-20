package org.sample.behavioral.command;

public class MainRemote {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light l = new Light();
        
        Command lightOnCmd = new LightOnCommand(l);
        Command lightOffCmd = new LightOffCommand(l);
        
        remoteControl.setCommand(lightOnCmd);
        remoteControl.pressButton();
        
        remoteControl.setCommand(lightOffCmd);
        remoteControl.pressButton();
    }
}
