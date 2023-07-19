package com.gurukul.assignment3;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int number = sc.nextInt();
		int reverse = 0;
		
		while(number>0) {
			int digit = number%10;
			reverse = reverse*10 + digit;
			number /= 10;
		}
		while(reverse>0) {
			int digit = reverse% 10;
			
			switch(digit) {
			
			case 0: 
				System.out.print("Zero ");
				break;
			case 1: 
				System.out.print("One ");
				break;
			case 2: 
				System.out.print("Two ");
				break;
			case 3: 
				System.out.print("Three ");
				break;
			case 4: 
				System.out.print("Four ");
				break;
			case 5: 
				System.out.print("Five ");
				break;
			case 6: 
				System.out.print("Six ");
				break;
			case 7: 
				System.out.print("Seven ");
				break;
			case 8: 
				System.out.print("Eight ");
				break;
			case 9: 
				System.out.print("Nine ");
				break;
			}
			reverse /= 10;
			
		}

	}

}
