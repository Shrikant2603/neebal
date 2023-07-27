package com.gurukul.assignment9;

import java.util.Scanner;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String a = sc.next();
	System.out.print("Enter a string");
	String b = sc.next();

	String small;
	String large;
	if (a.length() < b.length()) {
	    small = a;
	    large = b;
	} else {
	    small = b;
	    large = a;
	}
	String ind = "";
	String ans = "";
	for (int i = 0; i < small.length(); i++) {
	    for (int j = 0; j < large.length(); j++) {
		if ((large.charAt(j) == small.charAt(i)) && (ind.indexOf(large.charAt(j)) == -1)) {
		    ans += large.charAt(j);
		    ind += large.charAt(j);
		}
	    }
	}
	System.out.println(ans);
    }

}
