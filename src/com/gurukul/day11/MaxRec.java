package com.gurukul.day11;

public class MaxRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(max(74682));
    }

    public static int max(int n) {
	if ((n / 10) == 0) {
	    return n;
	} else {
	    return Math.max(n % 10, max(n / 10));
	}

    }
}
