package com.gurukul.day3;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x");
		int x = sc.nextInt();
		System.out.print("Enter y");
		int y = sc.nextInt();
		
		int sum = 0;		
		while(x>0) {
			if(x%2!=0) {
				sum += y;
			}
			x = x>>1;
			y = y<<1;
		}
		System.out.print(sum);
	}

}
