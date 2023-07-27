package com.gurukul.day11;

public class ReverseNumbRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(reverse(1234));

    }

    public static String reverse(int n) {
	if (n / 10 == 0) {
	    return n + "";
	} else {
	    return n % 10 + reverse(n / 10);
	}
    }

}
