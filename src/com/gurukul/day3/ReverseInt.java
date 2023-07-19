package com.gurukul.day3;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int ans = 0;
		
		while(n!=0) {
			int digit = n%10;
			ans = digit + ans*10;
			n = n/10;
		}
		System.out.print(ans);

	}

}
