package org.sample.creational.builder2;

import org.sample.creational.builder1.*;

/**
 *
 * @author user
 */
public interface PesananBuilder {
    public PesananBuilder addItem(Item item);
    public Pesanan build();
}
