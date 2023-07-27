package com.gurukul.assignment9;

import java.util.Scanner;

public class URLParser {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.nextLine();

	String ans;
	if (s.indexOf('.') == -1 || (s.indexOf('/') == -1 || s.indexOf(':') == -1) || s.indexOf('w') == -1) {
	    System.out.println("Invalid input");
	}
	if (s.indexOf(':') != -1) {
	    ans = s.substring(s.indexOf('w'), s.indexOf(':', s.indexOf('w')));
	}

	else {
	    ans = s.substring(s.indexOf('w'), s.indexOf('/', s.indexOf('w')));
	}

	System.out.println(ans);

    }

}
