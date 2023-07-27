package com.gurukul.day11;

public class StraightInsersionSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 1, 7, 11, 2, 9, 4, -21 };
	straightSelSort(arr);

	for (int i : arr) {
	    System.out.print(i + " ");
	}

    }

    public static void straightSelSort(int[] arr) {
	int n = arr.length;
	int j = 0;
	for (int i = 1; i < n; i++) {
	    int temp = arr[i];
	    for (j = i; j > 0 && arr[j - 1] > temp; j--) {
		arr[j] = arr[j - 1];
	    }
	    arr[j] = temp;
	}
    }

}
