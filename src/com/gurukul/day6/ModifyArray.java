package com.gurukul.day6;

import java.util.Scanner;

public class ModifyArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}

	for (int i = 0, j = (n + 1) / 2; j < n; i++, j++) {
	    int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;

	}
	for (int i = 0; i < n; i++) {
	    System.out.print(arr[i] + " ");
	}

    }

}
