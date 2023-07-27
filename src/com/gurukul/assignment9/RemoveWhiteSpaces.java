package com.gurukul.assignment9;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s = sc.nextLine();

	String[] arr = s.split(" ");
	String ans = "";
	for (int i = 0; i < arr.length; i++) {
	    ans = ans + arr[i];
	}
	if (ans == "") {
	    System.out.print("empty string after removing all the whitespace");
	} else {
	    System.out.print(ans);
	}
    }

}
