package com.gurukul.assignment11;

public class ArraySumRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { -1, -2, -3, -4, -5 };
	System.out.print(arrSum(arr, 0));

    }

    public static int arrSum(int[] arr, int i) {
	if (i == arr.length - 1) {
	    return arr[i];
	} else {
	    return arr[i] + arrSum(arr, i + 1);
	}
    }

}
