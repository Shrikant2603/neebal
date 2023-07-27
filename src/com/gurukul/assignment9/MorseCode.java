package com.gurukul.assignment9;

import java.util.Scanner;

public class MorseCode {
    // Incomplete
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String str = sc.nextLine();

	String s = str.toUpperCase();
	String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
		"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
	String ans = "";
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch == ' ')
		continue;
	    ans += arr[(int) ch - 65];
	}
	System.out.print(ans);
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch == ' ')
		continue;
	    ans += arr[(int) ch - 65];
	}
    }

}
