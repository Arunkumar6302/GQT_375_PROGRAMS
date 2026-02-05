package com.gqt.introduction;

public class Program11 {
	public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(s);
        if(s.equals(rev)) {
        	System.out.println("Palindromic String ");
        }else {
        	System.out.println("Not Palindromic String ");
        }
//        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
