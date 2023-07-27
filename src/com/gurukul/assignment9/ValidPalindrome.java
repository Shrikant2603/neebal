package com.gurukul.assignment9;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.nextLine();
	s = s.toLowerCase();
	boolean flag = true;

	StringBuffer sb = new StringBuffer("");

	for (int k = 0; k < s.length(); k++) {
	    if (Character.isLetter(s.charAt(k))) {
		sb.append(s.charAt(k));
	    }
	}
	int i = 0;
	int j = sb.length() - 1;
	while (i < j) {
	    if (sb.charAt(i) != sb.charAt(j)) {
		flag = false;
	    }
	    i++;
	    j--;
	}
	if (flag) {
	    System.out.println("Valid Palindrome");
	} else {
	    System.out.println("Invalid Palindrome");
	}
    }

}
