/*
 * Builder untuk paket 1 : ayam + nasi + air mineral
 */
package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class Paket2BuilderConcrete implements PaketBuilder {

    private Paket paket;

    public Paket2BuilderConcrete() {
        paket = new Paket();
    }

    @Override
    public void buildPaket() {
        paket.addItem(new Ayam());
        paket.addItem(new Nasi());
        paket.addItem(new EsTeh());
    }

    @Override
    public Paket getPaket() {
        return paket;
    }

}
