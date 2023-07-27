package com.gurukul.day11;

public class CountVowelsRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(countVowels("shrikant"));
    }

    public static int countVowels(String s) {

	if (s.length() == 0) {
	    return 0;
	} else {
	    char ch = s.charAt(0);

	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		return 1 + countVowels(s.substring(1));
	    }
	    return countVowels(s.substring(1));
	}
    }
}
