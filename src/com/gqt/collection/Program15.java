package com.gqt.collection;

import java.util.Properties;

public class Program15 {
	public static void main(String[] args) {
        Properties p = new Properties();
        System.out.println("setting Properties : ");
        p.setProperty("username", "admin");
        p.setProperty("password", "1234");
        System.out.println("Retriving data :  ");
        System.out.println("Username: " + p.getProperty("username"));
        System.out.println("Password: " + p.getProperty("password"));
    }
}
