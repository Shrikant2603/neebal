package com.gurukul.assignment2;

public class EvenFibonacci {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int f = 0;
	int s = 1;
	int t = 0;
	int count = 10;

	for (int i = 1; i <= count; i++) {
	    if (f % 2 == 0) {
		System.out.println(f);
	    } else {
		count++;
	    }
	    t = f + s;
	    f = s;
	    s = t;
	}
    }
}
