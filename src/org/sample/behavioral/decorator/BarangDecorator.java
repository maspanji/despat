package org.sample.behavioral.decorator;

/**
 *
 * @author user
 */
public abstract class BarangDecorator implements Barang{
    Barang barang;

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

}
