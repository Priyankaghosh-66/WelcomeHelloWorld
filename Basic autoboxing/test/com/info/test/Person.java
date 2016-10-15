/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info.test;

/**
 *
 * @author USER
 */
public class Person {
    private String firstName;
    private String lastName;
    private String emailId;
    public Person(String firstName,String lastName,String emailId){
        this.firstName=firstName;
        this.emailId=emailId;
       this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }
    @Override
    public String toString(){
        return this.firstName+ " " +this.emailId;
    }
    public int hashcode(){
        System.out.println("entering hashcode of Person");
        return this.firstName.hashCode()+this.lastName.hashCode()+this.emailId.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("entering equals of Person");
        if(!(obj instanceof Employee))
            return false;
        Person p;
        p = (Person)obj;
        if(this.firstName.equals(p.firstName)
            &&
                    this.lastName.equals(p.lastName)
                    &&
                    this.emailId.equals(p.emailId) )
            return true;
        return false;
        
    }
}
