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
public class Employee {
     private String firstName;
    private String lastName;
    private String emailId;
    public Employee(String firstName,String lastName,String emailId){
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
public String toString() {
	return this.firstName + " " + this.lastName + " " + this.emailId;
}
@Override
public int hashCode() {
	System.out.println("Entering hashCode of Employee");
	return this.firstName.hashCode() + this.lastName.hashCode() + this.emailId.hashCode();
}
@Override
public boolean equals(Object obj) {
	System.out.println("Entering equals of Employee");
	if(!(obj instanceof Employee))
		return false;
	//Person object to Employee object (ClasscastException)
	Employee p=(Employee)obj;
	if(this.firstName.equals(p.firstName) 
			&& 
	   this.lastName.equals(p.lastName) 
	   && 
	   this.emailId.equals(p.emailId) )
 return true;
 return false;
	
    
}
}
