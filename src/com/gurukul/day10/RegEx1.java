package com.gurukul.day10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.nextLine();

	String regex = "^[\\D][a-zA-Z0-9]{2}";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(s);

	if (matcher.matches()) {
	    System.out.println("Valid");
	} else {
	    System.out.println("Invalid");
	}
    }

}
