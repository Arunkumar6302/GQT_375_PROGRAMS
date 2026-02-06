package com.gqt.Strings;

public class Program22 {
	 public static void main(String[] args) {
	        String a = "java";
	        String b = "lava";
	        System.out.println("String-1: "+a);
	        System.out.println("String-2: "+b);
	        System.out.println("Common Characters in both the Strings :");
	        for (char ch : a.toCharArray())
	            if (b.indexOf(ch) != -1)
	                System.out.println(ch);
	    }
}
