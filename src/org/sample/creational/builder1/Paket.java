package org.sample.creational.builder1;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Paket {
    public ArrayList<Item> items;
    
    public Paket() {
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public double getTotalHarga(){
        double total = 0;
        for(Item item : items){
            total += item.getHarga();
        }
        return total;
    }
    
}
