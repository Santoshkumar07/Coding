package com.vm.training.java.basics.Assignments;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Task1 {
static  HashMap	 addContact(HashMap  contact,String  name,String contactnumber) {
	contact.put(name, contactnumber);
	return contact;
	}
static  HashMap	 removeContact(HashMap  contact,String  name,String contactnumber) {
	contact.remove(name,contactnumber);
	return   contact;
	
		
	}
static  HashMap	 displaysContact(HashMap contact) {
	///System.out.println("contact");
	return contact;		
	}
	public static void main(String[] args) {
		LinkedHashMap  contact =new LinkedHashMap();
		System.out.println("choose  for the  optinion");
		System.out.println("1. AddContacts");
		System.out.println("2.  RemoveContacts");
		System.out.println("3.  Show  All  Contacts");
		Scanner  num  =new  Scanner(System.in);
		int n = num.nextInt();		
	}

}
