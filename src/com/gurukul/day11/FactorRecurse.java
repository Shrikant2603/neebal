package com.gurukul.day11;

public class FactorRecurse {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(factorial(5));

    }

    public static int factorial(int n) {
	System.out.println("A" + n);
	if (n == 0) {
	    return 1;
	} else
	    System.out.println("B" + n);
	int f = n * factorial(n - 1);
	System.out.println("C" + n);

	return f;
    }

}
