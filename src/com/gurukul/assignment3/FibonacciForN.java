package com.gurukul.assignment3;

import java.util.Scanner;

public class FibonacciForN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start");
		int start = sc.nextInt();
		System.out.print("Enter the number");
		int count = sc.nextInt();
		int f = 0;
		int s = 1;
		int t = 1;
		
		while(count>0) {
			if(t>=start) {
				System.out.println(t);
				count--;
			}
			t = s+f;
			f = s;
			s = t;
		}

	}

}
