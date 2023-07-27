package com.gurukul.assignment9;

import java.util.Scanner;

public class FindAndRemoveWord {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence");
	String s = sc.nextLine();
	System.out.println("Enter the word");
	String w = sc.next();
	int ans = 0;
	int i = 0;
	while ((i = s.indexOf(w, i)) != -1) {
	    ans++;
	    i++;
	}
	System.out.println(ans);
    }

}
