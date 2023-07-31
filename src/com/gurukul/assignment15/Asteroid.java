package com.gurukul.assignment15;

import java.util.Stack;

public class Asteroid {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 5, 10, -5 };
	getAsteroid(arr);

    }

    public static void getAsteroid(int arr[]) {
	Stack<Integer> s = new Stack<>();
	for (int i = 0; i < arr.length; i++) {
	    if (s.isEmpty()) {
		s.push(arr[i]);
	    } else {
		if ((arr[i] < 0 && s.peek() >= 0) || (arr[i] >= 0 && s.peek() < 0)) {
		    if (Math.abs(arr[i]) > Math.abs(s.peek())) {
			s.pop();
			s.push(arr[i]);
		    } else if (Math.abs(arr[i]) == Math.abs(s.peek())) {
			s.pop();
		    }
		} else {
		    if (arr[i] > s.peek()) {

			s.push(arr[i]);
		    }
		}
	    }
	}

	for (int num : s) {
	    System.out.print(num + " ");
	}
    }
}
