package com.vm.training.java.basics.NewFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProductMain {

	public static void main(String[] args) {
		
		
ArrayList<Product> product=new ArrayList<Product>();
		
          product.add(new Product(1,"apple","electronics",23000,21));
          product.add(new Product(2,"fridge","electronics",22000,23));
          product.add(new Product(3,"apples","fruits",21000,20));
          product.add(new Product(4,"cooler","electronics",24000,42));
          product.add(new Product(5,"bananas","fruits",25000,21));
          product.add(new Product(4,"cooler","electronics",24000,42));
          product.add(new Product(5,"bananas","fruits",25000,21));
          
	      System.out.println("================Total Products================");
          long productcount=product.stream().count();
          System.out.println("total products are : "+productcount);
          System.out.println();
          System.out.println("===============Product by category==============");
          System.out.println("Category by fruits : ");
          List<Product> prd=product.stream().filter(s->s.getCategory().equals("fruits")).collect(Collectors.toList());
   
            prd.forEach(a->System.out.println(a));
          System.out.println();
          System.out.println("====================Selecting min max ===================");
          Product var = product.stream().max(Comparator.comparingInt(Product::getPrice)).get();
	
          System.out.println();
          System.out.print("MAX Price Product is : ");
          System.out.println(var.getPname()+" "+var.getPrice());
          Product var1 = product.stream().min(Comparator.comparingInt(Product::getPrice)).get();
      	
          System.out.println();
          System.out.print("MIN Price Product is : ");
          System.out.println(var1.getPname()+" "+var1.getPrice());
	    System.out.println();
  		  System.out.println("===============Price Greater Than===========");
  		product.stream().filter(p->p.getPrice()>23000).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()+"/-"));	
  		  		
  		System.out.println("================sorting by price or name ===============");
  		System.out.println();
  		System.out.println("sorting by price : ");
  		product.stream().sorted(Comparator.comparing(p->p.getPrice())).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));
  		//products.stream().sorted(Comparator.comparing(p->((Product) p).getPrice()).reversed()).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));//Dexcending order
  		System.out.println();
  		System.out.println("sorting by name : ");
  		product.stream().sorted(Comparator.comparing(p->p.getPname())).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));
  		
  		
  		System.out.println();
  		System.out.println("===========quantity greater than and category = electronics==============");
  		
  		
  		List<String> qe=product.stream().filter(p->p.getQuantity()>20 && p.getCategory().equalsIgnoreCase("electronics")).map(p->p.getPname()+" "+p.getPrice()).collect(Collectors.toList());
		
		qe.forEach(p->System.out.println(p));
		
		System.out.println();
		System.out.println("============Product Name to UpperCase========");
		product.stream().map(m->m.getPname().toUpperCase()).forEach(System.out::println);	
		
	System.out.println();
	System.out.println("=============count of product by category===========");
	long count= product.stream().filter(p->p.getCategory().equalsIgnoreCase("fruits")).count();
	System.out.println("Number of Products By Category fruits are : "+count);
	long  qc = product.stream().filter(p->p.getCategory().equalsIgnoreCase("fruits")).map(p->p.getQuantity()).reduce(0,(A,B)->A+B);
	System.out.println("All product quantities of fruits are : "+qc);
	
	//List<Product> uniqueproduct = product.stream().distinct();
	long  sk=3;
			//product.stream().skip(sk).forEach(System.out::println);
			product.stream().limit(sk).forEach(System.out::println);
			//Optinoal<Integer>  result= product.stream().reduce((a,b->a+b);
	}
	    


}