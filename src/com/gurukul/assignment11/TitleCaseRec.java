package com.gurukul.assignment11;

public class TitleCaseRec {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	titleCase("this is a test sentence");

    }

    public static void titleCase(String str) {
	if (str.indexOf(" ") == -1) {
	    System.out.print(Character.toUpperCase(str.charAt(0)) + str.substring(1) + " ");
	} else {
	    titleCase(str.substring(0, str.lastIndexOf(" ")));
	    String s = str.substring(str.lastIndexOf(" ") + 1);
	    System.out.print(Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ");
	}
    }
}
