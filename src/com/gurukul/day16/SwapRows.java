package com.gurukul.day16;

public class SwapRows {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[][] = { { 7, 8, 9, 10 }, { 9, 11, 12, 13 }, { 14, 15, 16, 17 } };

	swapRows(a);

	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}

    }

    public static void swapRows(int mat[][]) {
	int maxRow = 0;
	int minRow = 0;
	int maxNum = 0;
	int minNum = 0;
	for (int i = 0; i < mat.length; i++) {
	    for (int j = 0; j < mat[i].length; j++) {
		int num = mat[i][j];
		if (num > maxNum) {
		    maxNum = num;
		    maxRow = i;
		}
		if (num < minNum) {
		    minNum = num;
		    minRow = i;
		}
	    }
	}
	int[] minRowArr = mat[minRow];
	mat[minRow] = mat[maxRow];
	mat[maxRow] = minRowArr;
    }

}
