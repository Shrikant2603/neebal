package com.gurukul.assignment9;

import java.util.Scanner;

public class WordWrap {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Entere a sentence");
	String str = sc.nextLine();
	System.out.println("Entere the length of the line");
	int n = sc.nextInt();

	String[] arr = str.split(" ");

	StringBuffer sb = new StringBuffer("");

	for (String s : arr) {
	    if (s.length() > n) {
		System.out.println("Cant wrap the line without breaking the words");
		break;
	    }
	}
	String ans = "";
	int count = 0;

	for (int i = 0; i < arr.length; i++) {
	    if (n - arr[i].length() >= 0) {
		sb.append(arr[i]);
		count += arr[i].length();
	    } else {
		sb.append("\n");
		sb.append(arr[i]);
		sb.append(" ");
		count += arr[i].length() + 1;

	    }
	}
	System.out.print(sb);
    }

}
