package com.gurukul.assignment3;

import java.util.Scanner;

public class BinaryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		for(int i=num;i>=1;i--){
			for(int j=i;j<=num;j++){
			if(j%2==0)
				System.out.print("0");
			else
				System.out.print("1");
			}
			System.out.println();
		}
	}

}

