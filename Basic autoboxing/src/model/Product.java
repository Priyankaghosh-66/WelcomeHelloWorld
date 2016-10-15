/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class Product {
    String name;
    int id;
    int Price;
    
    public Product(){
        
    }
    public String getName(){
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getPrice(){
        return Price;
    }
    public void setPrice(int price){
        this.Price=price;
    }
}
