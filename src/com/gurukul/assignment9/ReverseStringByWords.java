package com.gurukul.assignment9;

import java.util.Scanner;

public class ReverseStringByWords {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence");
	String s = sc.nextLine();

	String[] arr = s.split(" ");

	for (int i = arr.length - 1; i >= 0; i--) {
	    System.out.print(arr[i] + " ");
	}
    }

}
