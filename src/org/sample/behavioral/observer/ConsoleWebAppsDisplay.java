package org.sample.behavioral.observer;

public class ConsoleWebAppsDisplay implements Observer{
    private String berita;
    
    @Override
    public void update(String berita) {
        this.berita = berita;
        display();
    }
    
    public void display(){
        System.out.println("Web apps menampilkan berita : "+berita);
    }
    
}
