package org.sample.behavioral.state;

public class ContextPalang {

    StatePalang statePalang;
    ConcretePalangTerbuka concretePalangTerbuka;
    ConcretePalangTertutup concretePalangTertutup;

    public ContextPalang() {
        concretePalangTerbuka = new ConcretePalangTerbuka(this);
        concretePalangTertutup = new ConcretePalangTertutup(this);
        statePalang = concretePalangTertutup;
    }

    public void setStatePalang(StatePalang statePalang) {
        this.statePalang = statePalang;
    }

    public ConcretePalangTerbuka getConcretePalangTerbuka() {
        return concretePalangTerbuka;
    }

    public ConcretePalangTertutup getConcretePalangTertutup() {
        return concretePalangTertutup;
    }
    
    public void bukaPalang(){
        statePalang.bukaPalang();
    }
    
    public void tutupPalang(){
        statePalang.tutupPalang();
    }

}
