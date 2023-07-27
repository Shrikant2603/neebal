package com.gurukul.day11;

public class PowerRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(power(2, 5));
    }

    public static int power(int b, int p) {
	if (p == 0) {
	    return 1;
	} else if (p == 1) {
	    return b;
	} else {
	    return b * power(b, p - 1);
	}
    }

}
