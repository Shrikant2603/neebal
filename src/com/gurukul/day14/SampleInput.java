package com.gurukul.day14;

import java.io.IOException;

public class SampleInput {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a name");
//	String str = sc.nextLine();
//
//	System.out.println("Name entered is: " + str);

	try {
	    System.out.println("Enter an input");
	    int a = System.in.read();
	    System.out.println("Input was " + a);
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}

    }

}
