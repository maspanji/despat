package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class Director {
    
    private PaketBuilder builder;
    
    public Director(PaketBuilder builder) {
        this.builder = builder;
    }
    
    public Paket getPaket(){
        builder.buildPaket();
        return builder.getPaket();
    }
    
}
