package com.gurukul.test1;

import java.util.Scanner;

public class LargestIncreasingSubarray {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number");
	int n = sc.nextInt();
	int lowerIndex = 0;
	int higherIndex = 0;
	int count = 1;
	int currentLength = 1;

	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	for (int i = 1; i < n; i++) {
	    if (arr[i] >= arr[i - 1]) {
		currentLength++;
	    } else {
		if (currentLength > count) {
		    count = currentLength;
		    higherIndex = i - 1;
		    lowerIndex = higherIndex - currentLength + 1;
		}
		currentLength = 1;
	    }
	}

	if (currentLength > count) {
	    count = currentLength;
	    higherIndex = n - 1;
	    lowerIndex = higherIndex - currentLength + 1;
	}
	System.out.println(lowerIndex);
	System.out.println(higherIndex);

    }
}
