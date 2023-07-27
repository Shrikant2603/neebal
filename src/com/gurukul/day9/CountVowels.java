package com.gurukul.day9;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Entere a string");
	String s = sc.next();
	s = s.toLowerCase();
	int ans = 0;
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		ans++;
	    }
	}
	System.out.println(ans);
    }

}
