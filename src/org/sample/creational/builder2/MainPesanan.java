package org.sample.creational.builder2;

import org.sample.creational.builder1.*;
/**
 *
 * @author user
 */
public class MainPesanan {
    public static void main(String[] args) {
        PesananConcrete pesanan = new PesananConcrete();
        pesanan.addItem(new EsTeh()).addItem(new AirMineral());
        Pesanan p = pesanan.build();
        System.out.println("total : "+p.getTotalHarga());
    }
}
