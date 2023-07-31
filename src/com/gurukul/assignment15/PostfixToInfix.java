package com.gurukul.assignment15;

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(postfixToInfix("AB^C*D-EF/GH+/+"));

    }

    public static String postfixToInfix(String exp) {
	String infix = "";
	Stack<String> s = new Stack<>();
	for (int i = 0; i < exp.length(); i++) {
	    char ch = exp.charAt(i);

	    if (Character.isLetter(ch)) {
		s.push("" + ch);
	    } else {
		String str2 = s.pop();
		String str1 = s.pop();
		infix = str1 + ch + str2;
		s.push("(" + str1 + ch + str2 + ")");
	    }
	}

	return infix;
    }
}
