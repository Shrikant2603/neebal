package com.gurukul.day3;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x");
		int x = sc.nextInt();
		System.out.print("Enter y");
		int y = sc.nextInt();
		
		while(x!=y) {
			if(x>y)
				x -= y;
			else
				y -= x;
		}
		System.out.print(x);
	}

}
