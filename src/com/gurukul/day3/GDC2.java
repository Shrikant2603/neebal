package com.gurukul.day3;

import java.util.Scanner;

public class GDC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x");
		int x = sc.nextInt();
		System.out.print("Enter y");
		int y = sc.nextInt();
		int r = x%y;
		
		while(r!=0) {
				x = y;
				y = r;
				r = x%y;
		}
		System.out.print(y);

	}

}
