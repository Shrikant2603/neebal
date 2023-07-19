package com.gurukul.day3;

import java.util.Scanner;

public class SpaceAlphabates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			for(int j=1;j<=(n*2-i*2);j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

}
