package com.gurukul.test1;

import java.util.Scanner;

public class StarSpacePattern {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	while (true) {
	    System.out.println("Enter a number");
	    int n = sc.nextInt();
	    if (n == -1) {
		System.out.println("You entered a -1 which is invalid");
		break;
	    }
	    for (int i = 1; i <= n; i++) {
		for (int j = n - i; j >= 1; j--) {
		    System.out.print(" ");
		}
		for (int j = 1; j <= i * 2 - 1; j++) {
		    if (j % 2 != 0) {
			System.out.print("*");
		    } else {
			System.out.print(" ");
		    }
		}
		System.out.println();
	    }
	}

    }

}
