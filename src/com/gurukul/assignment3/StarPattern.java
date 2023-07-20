package com.gurukul.assignment3;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int l = num/2;
		int u = num-l;
		
		for(int i=1;i<=l;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=num-i*2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=l;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=num-i*2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
