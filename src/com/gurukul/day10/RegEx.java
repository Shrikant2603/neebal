package com.gurukul.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String test1 = "12 True";
	String test2 = "true";
	String test3 = "Yes";
	String test4 = "yes";

	String regex = "[a-zA-Z)-9]*\\s[t|T]rue|^[y|Y]es";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(test1);

	if (matcher.matches()) {
	    System.out.println("String matches");
	} else {
	    System.out.println("String does not match");
	}

    }

}
