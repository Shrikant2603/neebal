package com.gurukul.day10;

import java.util.Scanner;

public class DeleteWord {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence");
	String s = sc.nextLine();
	System.out.println("Enter the word");
	String w = sc.next();

	StringBuffer sb = new StringBuffer(s);
	int index = 0;
//	index = sb.indexOf(w);
	while ((index = sb.indexOf(w, index)) != -1) {
	    sb.delete(index, index + w.length() + 1);

	    index++;
	}

	System.out.println(sb);
    }

}
