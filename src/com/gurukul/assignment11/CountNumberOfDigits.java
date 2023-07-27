package com.gurukul.assignment11;

public class CountNumberOfDigits {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(countNum(34534543));

    }

    public static int countNum(int n) {
	if (n / 10 == 0) {
	    return 1;
	} else {
	    return 1 + countNum(n / 10);
	}
    }

}
