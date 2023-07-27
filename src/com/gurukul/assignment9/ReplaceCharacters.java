package com.gurukul.assignment9;

import java.util.Scanner;

public class ReplaceCharacters {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.next();
	System.out.println("Enter a character to replace another character");
	char ch1 = sc.next().charAt(0);
	System.out.println("Enter a character be replaced");
	char ch2 = sc.next().charAt(0);

	String ans = "";
	if (s.indexOf(ch2) == -1) {
	    System.out.println("String does not contain the given character");
	}
	char[] arr = s.toCharArray();

	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == ch2) {
		arr[i] = ch1;
	    }
	}
	for (int i = 0; i < arr.length; i++) {
	    ans += arr[i];
	}
	System.out.println(ans);
    }

}
