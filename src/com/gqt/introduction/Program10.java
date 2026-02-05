package com.gqt.introduction;

public class Program10 {
	 public static void main(String[] args) {
	        String s = "Java";
	        String rev = "";

	        for (int i = s.length() - 1; i >= 0; i--) {
	            rev += s.charAt(i);
	        }
	        System.out.println("Normal String : "+s);
	        System.out.println("String After Reverse: "+rev);
	    }
}
