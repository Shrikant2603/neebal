package com.gurukul.assignment10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WholeNumber {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String str = sc.next();

	String regex = "^-{0,1}\\d+$";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(str);

	if (matcher.matches()) {
	    System.out.println("String is whole number");
	} else {
	    System.out.println("String is not whole number");
	}
    }

}
