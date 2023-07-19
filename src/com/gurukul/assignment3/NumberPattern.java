package com.gurukul.assignment3;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int x = 1;
		for(int i=1;i<=num;i++){
			for(int j=num-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(x%10);
				x++;
			}
			System.out.println();
		}

	}

}
