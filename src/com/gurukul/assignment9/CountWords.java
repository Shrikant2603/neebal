package com.gurukul.assignment9;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s = sc.nextLine();

	String[] arr = s.split(" ");
	System.out.println(arr.length);

    }

}
