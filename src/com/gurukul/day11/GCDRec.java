package com.gurukul.day11;

public class GCDRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(gcd(125, 175));
    }

    public static int gcd(int a, int b) {
	int small;
	int large;
	if (a > b) {
	    large = a;
	    small = b;
	} else {
	    large = b;
	    small = a;
	}

	if (large % small == 0) {
	    return small;
	} else {
	    return gcd(small, large % small);
	}
    }
}
