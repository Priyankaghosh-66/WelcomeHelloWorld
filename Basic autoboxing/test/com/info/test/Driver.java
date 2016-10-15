/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info.test;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class Driver {
    public static void main(String[] args){
      Person p1=new Person("James","Smith","james.smith@xyz.com");
      Person p2=new Person("clara","hyde","clara.hyde@abc.com");
      Employee e1=new Employee("james","Smith","james.smith@xyz.com");
      Set humanbeings=new HashSet();
      System.out.println(humanbeings.add(p1));
      System.out.println(humanbeings.add(p2));
      System.out.println(humanbeings.add(e1));
      System.out.println(humanbeings.toString());
    }
    
}
