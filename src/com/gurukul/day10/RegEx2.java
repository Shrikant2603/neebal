package com.gurukul.day10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String str = sc.nextLine();

	String[] arr = str.split(" ");

	String regex = "[a-zA-Z]{3}";

	Pattern pattern = Pattern.compile(regex);
	int ans = 0;
	for (String s : arr) {
	    Matcher matcher = pattern.matcher(s);
	    if (matcher.matches()) {
		ans++;
	    }
	}
	System.out.print(ans);
    }

}
