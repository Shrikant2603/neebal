package com.gurukul.day9;

import java.util.Scanner;

public class EqualName {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first name");
	String fName = sc.next();
	System.out.println("Enter last name");
	String lName = sc.next();

	if (fName.equals(lName)) {
	    System.out.println("The strings are same");
	} else {
	    String third = fName + " " + lName;
	    System.out.println(third);
	}
    }

}
