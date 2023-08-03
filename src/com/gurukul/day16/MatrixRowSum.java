package com.gurukul.day16;

public class MatrixRowSum {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10, 11 } };

	int arr[] = findRowSum(a);

	for (int n : arr) {
	    System.out.println(n + " ");
	}

    }

    public static int[] findRowSum(int mat[][]) {
	int arr[] = new int[mat.length];
	int sum = 0;
	for (int j = 0; j < mat.length; j++) {
	    for (int i = 0; i < mat[j].length; i++) {
		sum += mat[j][i];
	    }
	    arr[j] = sum;
	    sum = 0;
	}

	return arr;
    }

}
