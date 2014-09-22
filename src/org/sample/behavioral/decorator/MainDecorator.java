package org.sample.behavioral.decorator;

/**
 *
 * @author user
 */
public class MainDecorator {
    public static void main(String[] args) {
        //menghitung diskon untuk beras untuk veteran yang membawa LVRI
        Barang beras = new Beras();
        beras = new DiskonLVRI(beras);
        System.out.println("harga akhir : "+beras.getHarga());
        //menghitung diskon untuk minyak goreng untuk veteran yang membawa LVRI dan lencana
        Barang minyakGoreng = new MinyakGoreng();
        minyakGoreng = new DiskonLVRI(minyakGoreng);
        minyakGoreng = new DiskonLencana(minyakGoreng);
        System.out.println("harga akhir : "+minyakGoreng.getHarga());
    }
}