package com.gqt.Strings;

public class Program20 {
	 public static void main(String[] args) {
	        String s = "Java Programming";
	        System.out.println("String-1 : "+s);
	        String s1 = "Java";
	        System.out.println("String-2 :"+s1);
	        if(s.contains(s1)) {
	        	System.out.println(s1+ " is a substring of "+s);
	        }
	    }
}
