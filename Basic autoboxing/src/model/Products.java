/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author USER
 */

    
public class Products extends Product implements Details{
    ArrayList al= new ArrayList();
    @Override
    public void insert(Product p){
        al.add(p);
        System.out.println("Data Inserted");
        
    }
    @Override
    public void delete(int id){
       for(int i=0;i<al.size();i++)
       {
           Product p=new Product();
           p=(Product)al.get(i);
           if(p.getId()==id)
           {
               al.remove(i);
           }
       }
       System.out.println("Data deleted");
       this.retrieve();
    }
    @Override
    public void retrieve(){
        
        for(int i=0;i<al.size();i++)
        {
            Product p=new Product();
            p=(Product)al.get(i);
            System.out.println("ID: "+p.getId()+" Name: "+p.getName()+" Price: "+p.getPrice());
        }
    }
   /* public void Display(){
        System.out.println("the details of product is:");
    }*/

    
} 
