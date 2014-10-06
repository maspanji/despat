/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.creational.builder1;

/**
 *
 * @author user
 */
public class AirMineral implements Item{

    @Override
    public String getNama() {
        return "Air Mineral";
    }

    @Override
    public double getHarga() {
        return 1500;
    }
    
}
