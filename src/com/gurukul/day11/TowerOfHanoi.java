package com.gurukul.day11;

public class TowerOfHanoi {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	tower(4, 'a', 'b', 'c');

    }

    public static void tower(int n, char a, char b, char c) {
	if (n == 1) {
	    System.out.println("Move disc no. " + n + " from " + a + " to " + c);
	} else {
	    tower(n - 1, a, c, b);
	    System.out.println("Move disc no. " + n + " from " + a + " to " + c);
	    tower(n - 1, b, a, c);
	}
    }
}
