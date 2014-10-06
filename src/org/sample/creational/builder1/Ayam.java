package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class Ayam implements Item{

    @Override
    public String getNama() {
        return "Ayam";
    }

    @Override
    public double getHarga() {
        return 8000;
    }
}
