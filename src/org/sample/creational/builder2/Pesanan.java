package org.sample.creational.builder2;

import java.util.ArrayList;
import org.sample.creational.builder1.*;

/**
 *
 * @author user
 */
public class Pesanan {
    ArrayList<Item> items;

    public Pesanan() {
        items = new ArrayList<>();
    }
    
    public void addAll(ArrayList<Item> allItem){
        items.addAll(allItem);
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    public double getTotalHarga(){
        double total = 0;
        for(Item item : items){
            total += item.getHarga();
        }
        return total;
    }
}
