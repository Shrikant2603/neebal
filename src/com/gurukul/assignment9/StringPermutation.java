package com.gurukul.assignment9;

import java.util.Scanner;

public class StringPermutation {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.next();

	for (int i = 0; i < s.length(); i++) {
//	    String ans = "" + s.charAt(i);
	    for (int j = 0; j < s.length(); j++) {
		if (j == i) {
		    for (int k = 0; k < s.length(); k++) {
			String ans = "" + s.charAt(i);
			if (k != j) {
			    ans += s.charAt(k);
			}
//			ans = "";
			System.out.println(ans);
		    }
		}

	    }

	}

    }

}
