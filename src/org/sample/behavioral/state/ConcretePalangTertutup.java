package org.sample.behavioral.state;

public class ConcretePalangTertutup implements StatePalang {
    
    ContextPalang contextPalang;
    
    public ConcretePalangTertutup(ContextPalang contextPalang) {
        this.contextPalang = contextPalang;
    }
    
    @Override
    public void bukaPalang() {
        System.out.println("Palang akan terbuka !");
        contextPalang.setStatePalang(contextPalang.getConcretePalangTerbuka());
        System.out.println("Palang SUDAH terbuka !");
    }
    
    @Override
    public void tutupPalang() {
        System.out.println("Palang sudah tertutup....");
    }
}
