package com.vm.training.java.Collections;

import java.util.*; 
class   Restraunt{
	int rid;
	String name;
	String  address;
	String menu;
	public Restraunt(int rid, String name, String address, String menu) {
		super();
		this.rid = rid;
		this.name = name;
		this.address = address;
		this.menu = menu;
	}
}
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,Restraunt> map=new HashMap<Integer,Restraunt>();
		Restraunt r =new Restraunt(114,"New palace","bbc","veg");
	     /* map.put(07,"Dhoni");    
	      map.put(19,"Friedrice");    
	      map.put(12,"chicken"); 
	      map.put(103, "out"); 
	      map.put(103, "Gaurav");  
	      //System.out.println(map); 
	      
	      for(Map.Entry m : map.entrySet()){    
	    	    System.out.println(m.getKey()+" "+m.getValue());    
	    	   }  
	      map.remove(103,"Gaurav");
	      map.replace(12, "veg");  
	      
	      System.out.println(map); */
		map.put(1,r);
		System.out.println(r.rid+" "+r.name+" "+r.address+" "+r.menu);
		
	}
}	
	
	
