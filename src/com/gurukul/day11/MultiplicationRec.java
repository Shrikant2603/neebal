package com.gurukul.day11;

public class MultiplicationRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(multRec(19, 10));
    }

    public static int multRec(int n, int y) {
	if (n == 0) {
	    return 0;
	} else {

	    if (n % 2 != 0) {
		return y + multRec(n / 2, y * 2);
	    }
	    return multRec(n / 2, y * 2);
	}
    }
}
