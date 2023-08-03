package com.gurukul.day16;

import java.util.HashMap;

public class NumberToWords {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(intoWords(3450));

    }

    public static String intoWords(int num) {
	String ans = "";
	HashMap<Integer, String> map = new HashMap<>();
	map.put(0, "ZERO");
	map.put(1, "ONE");
	map.put(2, "TWO");
	map.put(3, "THREE");
	map.put(4, "FOUR");
	map.put(5, "FIVE");
	map.put(6, "SIX");
	map.put(7, "SEVEN");
	map.put(8, "EIGHT");
	map.put(9, "NINE");

	while (num != 0) {
	    int temp = num % 10;
	    ans = map.get(temp) + " " + ans;
	    num /= 10;
	}

	return ans;
    }

}
