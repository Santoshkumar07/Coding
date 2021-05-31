package com.vm.training.java.Concurrency;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

public static void main(String[] args) {

//HashMap<String, Integer> hm =new HashMap<String, Integer>();
	ConcurrentHashMap<String, Integer> hm =new ConcurrentHashMap<String, Integer>();

hm.put("sai", 95);
hm.put("kumar", 80);
hm.put("john", 90);

System.out.println("Elements of  map = "+hm);

/*hm.computeIfAbsent("lalit",a->75);
hm.computeIfAbsent("abc", a->70);
System.out.println(hm.containsValue(95));
System.out.println(hm.containsValue(94));
System.out.println(hm.containsValue(70));
System.out.println(hm.containsKey("hii"));
System.out.println(hm.containsKey("sam"));
System.out.println("After adding = "+hm);*/

/*for(Integer val :hm.values()) 
{
	System.out.println(val);
	hm.computeIfAbsent("mahesh", a->90);
}
System.out.println("elements of  hashmap= "+hm);
}*/
for(Entry<String, Integer> h:hm.entrySet() ) {
	
}
}
}