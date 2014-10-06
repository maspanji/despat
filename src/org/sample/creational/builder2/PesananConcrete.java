package org.sample.creational.builder2;

import java.util.ArrayList;
import org.sample.creational.builder1.Item;

/**
 *
 * @author user
 */
public class PesananConcrete implements PesananBuilder{
    
    ArrayList<Item> list;

    public PesananConcrete() {
        list = new ArrayList<>();
    }
    
    @Override
    public PesananBuilder addItem(Item item) {
        list.add(item);
        return this;
    }

    @Override
    public Pesanan build() {
        Pesanan pesanan = new Pesanan();
        pesanan.addAll(list);
        return pesanan;
    }
    
}
