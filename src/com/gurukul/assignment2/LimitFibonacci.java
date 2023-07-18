package com.gurukul.assignment2;

import java.util.Scanner;

public class LimitFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower limit");
		int lower = sc.nextInt();
		System.out.print("Enter the upper limit");
		int upper = sc.nextInt();
		int f = 0;
		int s = 1;
		int t = 0;
		
		for(int i=1;i<=upper;i++) {
			if(f>=lower && f<upper) {
				System.out.println(f);
			}
			else if(f>upper)
				break;
			t = f+s;
			f = s;
			s = t;
		}

	}

}
