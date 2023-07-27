package com.gurukul.assignment9;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.next();
	int ans = 1;
	for (int i = 0; i < s.length(); i++) {
	    if (Character.isUpperCase(s.charAt(i))) {
		ans++;
	    }
	}
	System.out.print(ans);
    }

}
