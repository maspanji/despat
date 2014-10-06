/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.creational.singleton;

/**
 *
 * @author user
 */
public class Singleton {
    private Singleton singleton;
    private Singleton(){
    }
    
    public Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }
    
}
