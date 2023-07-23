package com.gurukul.test1;

import java.util.Scanner;

public class ReverseFibonnacci {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int arr[] = new int[n];
	arr[0] = 0;
	arr[1] = 1;

	for (int i = 2; i < n; i++) {
	    arr[i] = arr[i - 2] + arr[i - 1];
	}
	for (int i = n - 1; i >= 0; i--) {
	    System.out.println(arr[i]);
	}

    }

}
