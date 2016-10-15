/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import model.Product;
import model.Products;
/**
 *
 * @author USER
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        Products pds=new Products();
        for(int i=0;i<3;i++)
        {
            Product p=new Product();
            
            System.out.println("Enter id: ");
            p.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter name: ");
            p.setName(sc.nextLine());
            System.out.println("Enter price: ");
            p.setPrice(sc.nextInt());
            pds.insert(p);
            
        }
        
        pds.retrieve();
        pds.delete(12);
        
        
    }
    
}
