package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class Nasi implements Item{

    @Override
    public String getNama() {
        return "Nasi";
    }

    @Override
    public double getHarga() {
        return 1000;
    }
    
}
