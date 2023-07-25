package com.gurukul.day9;

import java.util.Scanner;

public class UnicodeTryCatch {

    public static boolean typeOfChar(int num) throws Exception {
	if (Character.isAlphabetic(num)) {
	    return true;
	} else if (Character.isDigit(num)) {
	    return false;
	}
	throw new Exception();
    }

    public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	try {
	    if (typeOfChar(n)) {
		System.out.println("It is a Alphabate");
	    } else {
		System.out.println("It is a Digit");
	    }
	} catch (Exception e) {
	    System.out.println("It is a Special Character");
	}

    }

}
