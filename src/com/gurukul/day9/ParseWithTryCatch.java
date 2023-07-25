package com.gurukul.day9;

import java.util.Scanner;

public class ParseWithTryCatch {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number string");
	String num = sc.next();
	int intoInt = 0;
	float intoFloat = 0;
	double intoDouble = 0;

	try {
	    try {
		double intoDouble1 = Double.parseDouble(num);
		System.out.println("String is convertable into a double");
	    } catch (Exception e) {
		System.out.println("Invalid string " + e);
	    }
	    intoFloat = Float.parseFloat(num);
	    System.out.println("String is convertable into a float");
	    intoInt = Integer.parseInt(num);
	    System.out.println("String is convertable into a int");

	} catch (Exception e) {
	    System.out.println("error" + e);
	}

    }

}
