package com.gurukul.assignment9;

import java.util.Scanner;

public class CountOccurences {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String str = sc.next();

	String ans = "";
	for (int i = 0; i < str.length(); i++) {
	    char ch = str.charAt(i);
	    if (ans.indexOf(ch) == -1) {
		ans += ch;
	    }
	}
	for (int i = 0; i < ans.length(); i++) {
	    int count = 0;
	    for (int j = 0; j < str.length(); j++) {
		char ch = str.charAt(j);
		if (ch == ans.charAt(i)) {
		    count++;
		}
	    }
	    System.out.println("Character count of character " + "'" + ans.charAt(i) + "'" + " is " + count);
	}
    }

}
