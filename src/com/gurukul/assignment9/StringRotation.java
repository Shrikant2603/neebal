package com.gurukul.assignment9;

import java.util.Scanner;

public class StringRotation {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.next();
	System.out.print("Enter the rotated string");
	String r = sc.next();
//	String original = s;

	if (s.length() != r.length()) {
	    System.out.println("Given string is not a rotation of the other one");
	} else {
	    boolean flag = false;
	    for (int i = 0; i < s.length() - 1; i++) {
		String ans = "";

		ans += s.charAt(s.length() - 1);
		for (int j = 0; j < s.length() - 1; j++) {
		    ans += s.charAt(j);
		}
//		System.out.println(ans);
		if (ans.equals(r)) {
		    flag = true;
		    break;
		}
		s = ans;
	    }
	    if (flag) {
		System.out.println("Given string is a rotation of the other one");
	    } else {
		System.out.println("Given string is not a rotation of the other one");
	    }
	}
    }

}
