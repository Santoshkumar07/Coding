package com.vm.training.java.Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class LinkedListSet {

	public static void main(String[] args) {
		/*LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        //Traversing the list of elements in reverse order  
        Iterator itr=(Iterator) ll.iterator();  
        while(((java.util.Iterator<String>) itr).hasNext()){  
         System.out.println(ll);  
        } */
        
/*LinkedHashSet<String> set=new LinkedHashSet();  
set.add("One");    
set.add("Two");    
set.add("Three");   
set.add("Four");  
set.add("Five");  
Iterator<String> i=set.iterator();  
while(i.hasNext())  
{  	
	  System.out.println(i.next());          
}  
LinkedHashSet<String> copy = (LinkedHashSet<String>) set.clone();
System.out.println(copy);*/
		
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("","ssss");
		map.put("sseedd","");
		map.put("go","gone");
		map.put("","");
		System.out.println(map);
		for(Entry<String, String> m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
	      
}  
}