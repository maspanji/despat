package org.sample.behavioral.decorator;

/**
 *
 * @author user
 */
public class DiskonLencana extends BarangDecorator{
    double diskon;
    
    public DiskonLencana(Barang b) {
        this.setBarang(b);
        this.diskon=0.1;
    }
    //perhitungan diskon jika membawa lencana
    @Override
    public double getHarga() {
        double hargaAkhir =barang.getHarga()-barang.getHarga()*this.diskon;
        return hargaAkhir;
    }
    
}
