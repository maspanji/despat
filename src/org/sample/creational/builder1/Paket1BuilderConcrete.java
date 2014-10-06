/*
 * builder untuk paket 2 : ayam + nasi + es teh
 */
package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class Paket1BuilderConcrete implements PaketBuilder{
    private Paket paket;

    public Paket1BuilderConcrete() {
        paket = new Paket();
    }
    
    @Override
    public void buildPaket() {
        paket.addItem(new Ayam());
        paket.addItem(new Nasi());
        paket.addItem(new AirMineral());
    }

    @Override
    public Paket getPaket() {
        return paket;
    }
    
}
