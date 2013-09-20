package org.sample.behavioral.observer;

public class MainBerita {

    public static void main(String[] args){
        //one subject
        ConcreteBerita concreteBerita = new ConcreteBerita();
        //many display
        ConsoleMobilAppsDisplay mobilAppsDisplay = new ConsoleMobilAppsDisplay();
        ConsoleWebAppsDisplay webAppsDisplay = new ConsoleWebAppsDisplay();
        //register ke subject
        concreteBerita.registerObserver(webAppsDisplay);
        concreteBerita.registerObserver(mobilAppsDisplay);
        System.out.println("BERITA BARU");
        concreteBerita.setBerita("BBM untuk Android rilis hari ini !");
        System.out.println("BERITA BARU");
        concreteBerita.setBerita("BBM untuk Android rilis hari besok !");
    }
}
