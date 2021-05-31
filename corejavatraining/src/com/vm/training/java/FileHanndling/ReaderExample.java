package com.vm.training.java.FileHanndling;

import java.io.*;
import java.util.StringTokenizer;
class ReaderExample{
    public static void main(String args[])throws IOException{
        FileReader fr = new FileReader("santosh.txt");
        BufferedReader br = new BufferedReader(fr);
        String str = new String();
        while((str = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str, " .?!,");
            int count = st.countTokens();
            for(int i = 1; i <= count; i++){
                String word = st.nextToken();
                StringBuffer sb = new StringBuffer(word);
                sb.reverse();
                System.out.println(sb);
            }
        }
    }
}