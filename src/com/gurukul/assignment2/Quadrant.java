package com.gurukul.assignment2;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value");
		int x = sc.nextInt();
		System.out.print("Enter y value");
		int y = sc.nextInt();

		if(x>0 && y>0) {
			System.out.print("1st Quadrant");
		}
		else if(x<0 && y>0) {
			System.out.print("2nd Quadrant");
		}
		else if(x<0 && y<0) {
			System.out.print("3rd Quadrant");
		}
		else if(x>0 && y<0) {
			System.out.print("4th Quadrant");
		}
		else {
			if(x==0 && y==0) {
				System.out.print("Center");
			}
			else if(x==0) {
				System.out.print("Y axis");
			}
			else
				System.out.print("X axis");

		}
	}

}
