package org.sample.behavioral.decorator;

/**
 *
 * @author user
 */
public class DiskonLVRI extends BarangDecorator {

    double diskon;

    public DiskonLVRI(Barang b) {
        this.setBarang(b);
        this.diskon = 0.3;
    }
    //perhitungan diskon jika membawa lencana

    @Override
    public double getHarga() {
        double hargaAkhir = barang.getHarga() - barang.getHarga() * this.diskon;
        return hargaAkhir;
    }
}
