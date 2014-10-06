package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class MainBuilder {

    public static Paket buildPaket1() {
        return new Director(new Paket1BuilderConcrete()).getPaket();
    }

    public static Paket buildPaket2() {
        return new Director(new Paket2BuilderConcrete()).getPaket();
    }

    public static void main(String[] args) {
        Paket paket1 = buildPaket1();
        System.out.println("PAKET 1");
        System.out.println("=======");
        for (Item i : paket1.getItems()) {
            System.out.println(i.getNama());
        }
        System.out.println("Total Harga : Rp " + paket1.getTotalHarga());
        System.out.println("=======");
    }
}
