package com.gurukul.assignment10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowel {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String test1 = "about";
	String test2 = "true";
	String test3 = "Yes";
	String test4 = "yes";

	String regex = "^[AEIOUaeiou].*";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(test1);

	if (matcher.matches()) {
	    System.out.println("Valid String");
	} else {
	    System.out.println("Invalid String");
	}
    }

}
