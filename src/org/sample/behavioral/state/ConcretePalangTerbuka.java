package org.sample.behavioral.state;

public class ConcretePalangTerbuka implements StatePalang{
    
    ContextPalang contextPalang;

    public ConcretePalangTerbuka(ContextPalang contextPalang) {
        this.contextPalang = contextPalang;
    }
    
    @Override
    public void bukaPalang() {
        System.out.println("Palang sudah terbuka .....");
    }

    @Override
    public void tutupPalang() {
        System.out.println("Palang akan tertutup !");
        contextPalang.setStatePalang(contextPalang.getConcretePalangTertutup());
        System.out.println("Palang SUDAH tertutup !");
    }
    
}
