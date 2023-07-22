package com.gurukul.day6;

import java.util.Scanner;

public class Interchange {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	int minIndex = 0;
	int maxIndex = 0;
	for (int i = 0; i < n; i++) {
	    if (arr[i] < arr[minIndex]) {
		minIndex = i;
	    }
	    if (arr[i] > arr[maxIndex]) {
		maxIndex = i;
	    }

	}
	int t = arr[minIndex];
	arr[minIndex] = arr[maxIndex];
	arr[maxIndex] = t;
	for (int i = 0; i < n; i++) {
	    System.out.print(arr[i] + " ");
	}

    }

}
