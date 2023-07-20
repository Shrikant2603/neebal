package com.gurukul.assignment3;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int number = sc.nextInt();
		String ans = "";
		
//		System.out.print(number+ " " + original + " " + numOfDigits);
		while(number>0) {
			int digit = number%10;
			
			switch(digit) {
			
			case 0: 
				ans = ("Zero ") + ans;
				break;
			case 1: 
				ans = ("One ") + ans;
				break;
			case 2: 
				ans = ("Two ") + ans;
				break;
			case 3: 
				ans = ("Three ") + ans;
				break;
			case 4: 
				ans = ("Four ") + ans;
				break;
			case 5: 
				ans = ("Five ") + ans;
				break;
			case 6: 
				ans = ("Six ") + ans;
				break;
			case 7: 
				ans = ("Seven ") + ans;
				break;
			case 8: 
				ans = ("Eight ") + ans;
				break;
			case 9: 
				ans = ("Nine ") + ans;
				break;
			}
			number /=10;
			
		}
		System.out.print(ans);

	}

}
