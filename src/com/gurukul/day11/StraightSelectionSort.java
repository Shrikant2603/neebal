package com.gurukul.day11;

public class StraightSelectionSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 1, 7, 11, 2, 9, 4, -21 };
	straightSelectionSort(arr);

	for (int i : arr) {
	    System.out.print(i + " ");
	}
    }

    public static void straightSelectionSort(int[] arr) {
	int n = arr.length;
	int j;
	for (int i = 0; i < n - 1; i++) {
	    int ind = i;
	    for (j = i + 1; j < n; j++) {
		if (arr[j] < arr[ind]) {
		    ind = j;
		}
	    }
	    int temp = arr[i];
	    arr[i] = arr[ind];
	    arr[ind] = temp;
	}
    }

}
