package org.sample.behavioral.observer;

public class ConsoleMobilAppsDisplay implements Observer{
    private String berita;
    
    public void display(){
        System.out.println("Mobil Apps Menampilkan : "+berita);
    }

    @Override
    public void update(String berita) {
        this.berita = berita;
        display();
    }
}
