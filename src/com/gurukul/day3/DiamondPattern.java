package com.gurukul.day3;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an odd number");
		int n = sc.nextInt();
		int u = n/2;
		int l = n-u;
		
		for(int i=1;i<=u;i++) {
			for(int j=1;j<=l-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=l;i>=1;i--) {
			for(int j=1;j<=l-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
