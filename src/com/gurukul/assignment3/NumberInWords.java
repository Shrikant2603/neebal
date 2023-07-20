package com.gurukul.assignment3;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int number = sc.nextInt();
		int original = number;
		double numOfDigits = 0;
		
		while(original!=0) {
			numOfDigits++;
			original /= 10;
		}
//		System.out.print(number+ " " + original + " " + numOfDigits);
		while(numOfDigits>0) {
			double digit1 = number/ (Math.pow(10, numOfDigits-1));
			int digit = (int) digit1;
			
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
			number %= (Math.pow(10, numOfDigits-1));
			numOfDigits--;
			
		}

	}

}
