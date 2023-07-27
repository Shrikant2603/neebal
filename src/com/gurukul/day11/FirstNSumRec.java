package com.gurukul.day11;

public class FirstNSumRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(firstN(5));

    }

    public static int firstN(int n) {
	if (n == 0) {
	    return 0;
	} else {
	    return firstN(n - 1) + n;
	}
    }

}
