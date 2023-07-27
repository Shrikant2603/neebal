package com.gurukul.day11;

public class BinaryRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(inBinary(19));

    }

    public static String inBinary(int n) {
	if (n == 0 || n == 1) {
	    return n + "";
	} else {
	    return inBinary(n / 2) + n % 2;
	}
    }

}
