package com.gurukul.assignment15;

import java.util.Stack;

public class CorrectForm {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(isReverse("ABBABACABABBA"));
    }

    public static boolean isReverse(String x) {
	Stack<Character> s = new Stack<>();
	int i = 0;
	while (x.charAt(i) != 'C') {
	    s.push(x.charAt(i));
	    i++;
	}
	for (int j = i + 1; j < x.length(); j++) {
	    char ch = x.charAt(j);

	    if (ch != s.pop()) {
		return false;
	    }
	}
	return true;

    }

}
