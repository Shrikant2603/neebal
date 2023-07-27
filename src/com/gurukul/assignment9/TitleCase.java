package com.gurukul.assignment9;

import java.util.Scanner;

public class TitleCase {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.nextLine();

	String[] arr = s.split(" ");
	for (int i = 0; i < arr.length; i++) {
	    String temp = (Character.toUpperCase(arr[i].charAt(0))) + arr[i].substring(1);
	    arr[i] = temp;
	}
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}

    }

}
