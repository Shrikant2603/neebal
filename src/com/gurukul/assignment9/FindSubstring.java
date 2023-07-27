package com.gurukul.assignment9;

import java.util.Scanner;

public class FindSubstring {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s = sc.nextLine();
	System.out.println("Enter a word");
	String w = sc.next();

	int ind = 0;
	while (s.indexOf(w, ind) != -1) {
	    ind = s.indexOf(w, ind);
	    System.out.print(ind + " ");
	    ind++;
	}
    }

}
