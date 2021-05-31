package com.vm.training.java.strings;

public class StringObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Value Momentum");
		String s2 = new String("Value Momentum");
		
		String s3 ="Value Momentum";
		String s4 ="Value Momentum";
		String s5 ="    Value Momentum   ";
		
		/*System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		s1 = s1.concat("sudaksha");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(10));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.intern());
		System.out.println(s1.intern()==s2.intern());
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.replace("Value Momentumsudaksha","Value"));
		System.out.println(s2.repeat(2));
		System.out.println(s3.substring(0,3));
		System.out.println(s5.replace("    Value Momentum   ","ValueMomentum"));
		*/
		StringBuilder sb=new StringBuilder("XYZ");
		sb.append("ABC");
		System.out.println(sb);
		StringBuffer sbf=new StringBuffer("abc");
		sbf.append("XYZ");
		System.out.println(sbf);
		
		
		
	}

}
