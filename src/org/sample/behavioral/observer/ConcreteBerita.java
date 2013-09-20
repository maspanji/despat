package org.sample.behavioral.observer;

import java.util.ArrayList;

public class ConcreteBerita implements Subject {

    private ArrayList<Observer> penerimaBerita;
    private String berita;

    public ConcreteBerita() {
        penerimaBerita = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        penerimaBerita.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = penerimaBerita.indexOf(observer);
        if (i >= 0) {
            penerimaBerita.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer concreteObserver : penerimaBerita) {
            concreteObserver.update(berita);
        }
    }

    @Override
    public void beritaChanged() {
        notifyObserver();
    }

    public void setBerita(String berita) {
        this.berita = berita;
        beritaChanged();
    }
}