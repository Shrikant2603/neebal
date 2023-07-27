package com.gurukul.assignment9;

import java.util.Scanner;

public class ClosingBrackest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.next();

	boolean flag = true;
	int left = 0;
	int right = 0;

	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == '(') {
		left++;
	    } else if (s.charAt(i) == ')') {
		right++;
	    }
	    if (left < right) {
		flag = false;
		break;
	    }
	}
	if (flag) {
	    System.out.println("Valid Paranthesis");
	} else {
	    System.out.println("Invalid Paranthesis");
	}

    }

}
