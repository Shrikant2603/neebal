package com.gurukul.day3;

import java.util.Scanner;

public class AlphabeticalsStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.print((char)(j+64) + " ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}
