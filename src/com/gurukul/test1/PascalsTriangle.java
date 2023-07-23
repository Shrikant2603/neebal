package com.gurukul.test1;

import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();

	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= n - i; j++) {
		System.out.print(" ");
	    }
	    for (int j = 1; j <= 2 * i - 1; j++) {
		if (j % 2 != 0) {
		    if (j > i) {
			System.out.print(0 + j);
		    } else {
//			System.out.print(i - );
		    }
		} else {
		    System.out.print(" ");

		}
	    }
	    System.out.println();
	}

    }

}
