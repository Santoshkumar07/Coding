package com.vm.training.java.Collections;
import java.util.ArrayList;
public class ArrayListAssignment {
	public static void main(String[] args)
	{
	ArrayList<String> javabatch = new ArrayList<String>();
	javabatch.add("ravi");
	javabatch.add("john");
	javabatch.add("anil");
	javabatch.add("kumar");
	ArrayList<String> sqlbatch = new ArrayList<String>();
	sqlbatch .add("sourab");
	sqlbatch .add("ankita");
	sqlbatch .add("john");
	sqlbatch .add("kumar");
	sqlbatch .add("manoj");
	javabatch.addAll(sqlbatch);
	System.out.println(javabatch);
	//javabatch =javabatch.removeDuplicates(javabatch);


}

	
}
