package com.gurukul.assignment15;

import java.util.Stack;

public class Baseball {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String arr[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };
	System.out.print(findSum(arr));

    }

    public static int findSum(String arr[]) {
	int ans = 0;
	Stack<String> s = new Stack<>();
	for (int i = 0; i < arr.length; i++) {
	    String str = arr[i];
	    if (str == "C") {
		ans -= Integer.parseInt(s.pop());

	    } else if (str == "+") {
		String temp = s.pop();
		String temp2 = s.peek();
		s.push(temp);
		int sum = Integer.parseInt(temp) + Integer.parseInt(temp2);
		ans += sum;
		s.push("" + sum);
	    } else if (str == "D") {
		int sum = Integer.parseInt(s.peek()) * 2;
		ans += sum;
		s.push("" + sum);
	    } else {
		s.push(arr[i]);
		ans += Integer.parseInt(arr[i]);
	    }
	}

	return ans;
    }

}
