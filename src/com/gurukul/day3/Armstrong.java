package com.gurukul.day3;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int original = n;
		int temp = n;
		int power = 0;
		double sum = 0;
		
		while(n!=0) {
			power++;
			n = n/10;
		}
		while(temp!=0) {
			int digit = temp%10;
			sum = sum + Math.pow(digit, power);
			temp = temp/10;
		}
		if(original==sum)
			System.out.print("Armstrong number");
			
		else
			System.out.print("Not an Armstrong number");

	}

}
