package com.gurukul.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdress {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the IP adress");
	String str = sc.nextLine();

	boolean flag = true;

	String[] arr = str.split("\\.");
	if (arr.length != 4) {
	    flag = false;
	}
	for (int i = 0; i < str.length(); i++) {
	    if (!((Character.isDigit(str.charAt(i)) || str.charAt(i) == '.'))) {
		flag = false;
		break;
	    }
	}

	if (flag) {
	    for (String s : arr) {
		if (Integer.parseInt(s) > 255) {
		    flag = false;
		    break;

		}
	    }
	}

	String regex = "^[1-9]\\d{0,2}";
	Pattern pattern = Pattern.compile(regex);
	for (String s : arr) {
	    Matcher matcher = pattern.matcher(s);
	    if (!matcher.matches()) {
		flag = false;
		break;

	    }
	}
	if (flag) {
	    System.out.println("Valid IP address");
	} else {
	    System.out.println("Invalid IP address");

	}
    }

}
