package com.vm.training.java.basics.NewFeatures;

import java.util.Scanner;

interface StringReverse
{
void     reverse(String str);
}

public class LamdaExpressonToRerveseaString {
	 Scanner sc = new Scanner(System.in);
	 StringReverse reverse = (str) -> {  
        String result = "";
        for(int i = str.length()-1; i >= 0; i--)
           result += str.charAt(i);
       // return result;
     };
     String word = sc.nextLine();
    // System.out.println("revere string is :" +reverse.lengthOfString(word));

  }
