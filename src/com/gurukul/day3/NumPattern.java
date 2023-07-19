package com.gurukul.day3;

import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int i=1;
		
		while(i<=num) {
			int j=1;
			while(j<=num-i){
				System.out.print(" ");
				j++;
			}
			j=i;
			while(j>=1) {
				System.out.print(j);
				j--;
			}
			j=2;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
