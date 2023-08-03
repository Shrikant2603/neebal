package com.gurukul.day16;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeUsingDeque {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(isPalindrome("Sir, I demand, I am a maid named Iris"));

    }

    public static boolean isPalindrome(String str) {

	Deque<Character> deque = new ArrayDeque<>();

	str = str.toLowerCase();
	for (int i = 0; i < str.length(); i++) {
	    char ch = str.charAt(i);
	    if (Character.isLetter(ch)) {
		deque.add(ch);
	    }
	}
	while (deque.size() > 1) {
	    char ch1 = deque.removeFirst();
	    char ch2 = deque.removeLast();

	    if (ch1 != ch2) {
		return false;
	    }
	}
	return true;
    }

}
