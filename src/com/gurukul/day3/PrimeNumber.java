package com.gurukul.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		boolean prime = true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			int x = n%i;
			if(x==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.print("The number " + n + " is a prime number");
		}
		else {
			System.out.print("The number " + n + " is not a prime number");
		}

	}

}
