package com.gurukul.day3;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n!=0) {
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.print(sum);

	}

}
