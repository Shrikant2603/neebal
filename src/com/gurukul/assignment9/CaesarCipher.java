package com.gurukul.assignment9;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String s = sc.nextLine();
	System.out.print("Enter a number to shift the alphabates");
	int n = sc.nextInt();
	n = n % 26;

//	s = s.toUpperCase();
	char[] arr = s.toCharArray();
	int[] numArr = new int[26];
	for (int i = 0; i < numArr.length; i++) {
	    numArr[i] = i + 65;
	}
	int[] numArr1 = new int[26];
	for (int i = 0; i < numArr.length; i++) {
	    numArr1[i] = i + 97;
	}

	int ind = 0;
	for (int i = 0; i < 26; i++) {
	    if (numArr[i] + n < 91) {
		numArr[i] += n;
	    } else {
		numArr[i] = 65 + ind;
		ind++;
	    }
	}

//	for (int i : numArr1) {
//	    System.out.print(i + " ");
//	}

	int ind1 = 0;
	for (int j = 0; j < 26; j++) {
	    if (numArr1[j] + n < 123) {
		numArr1[j] += n;
	    } else {
		numArr1[j] = 97 + ind1;
		ind1++;
	    }
	}

	for (int i = 0; i < arr.length; i++) {
	    int index = (int) arr[i];
	    if (index == 32) {
		System.out.print(" ");
	    } else {
		if (index > 64 && index < 91) {
		    System.out.print((char) numArr[index - 65]);
		} else if (index > 96 && index < 123) {
		    System.out.print((char) numArr1[index - 97]);
		} else {
		    System.out.print(arr[i]);
		}

	    }
	}

    }

}
