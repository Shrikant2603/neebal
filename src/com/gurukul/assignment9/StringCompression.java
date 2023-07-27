package com.gurukul.assignment9;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.next();
	String ans = "";

	char ch = s.charAt(0);
	int count = 1;

	for (int i = 1; i < s.length(); i++) {
	    char ch1 = s.charAt(i);
	    if (ch1 == ch) {
		count++;
	    } else {
		ans = ans + ch;
		ans += count;
		ch = ch1;
		count = 1;
	    }

	}
	ans += ch;
	ans += count;

	System.out.println(ans);

    }

}
