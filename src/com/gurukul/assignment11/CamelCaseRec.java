package com.gurukul.assignment11;

public class CamelCaseRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.print(camelCase("helloWorld"));

    }

    public static int camelCase(String s) {
	if (s.length() == 1) {
	    return 1;
	} else {
	    if (Character.isUpperCase(s.charAt(s.length() - 1))) {
		return 1 + camelCase(s.substring(0, s.length() - 1));
	    }
	}
	return camelCase(s.substring(0, s.length() - 1));
    }
}
