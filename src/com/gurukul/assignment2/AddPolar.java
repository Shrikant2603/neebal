package com.gurukul.assignment2;

import java.util.Scanner;

public class AddPolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius1");
		double r1 = sc.nextDouble();
		System.out.print("Enter the radius2");
		double r2 = sc.nextDouble();
		System.out.print("Enter the anglel1");
		double th1 = sc.nextDouble();
		System.out.print("Enter the angle2");
		double th2 = sc.nextDouble();
		
//		convert the angles to radians from degrees
		
		double a1 = Math.toRadians(th1);
		double a2 = Math.toRadians(th2);
		
		double x1 = r1 * Math.cos(a1);
		double y1 = r1 * Math.sin(a1);
		
		double x2 = r2 * Math.cos(a2);
		double y2 = r2 * Math.sin(a2);
		
		double x3 = x1 + x2;
		double y3 = y1 + y2;
	
		double r3 = Math.sqrt((Math.pow(x3, 2) + Math.pow(y3, 2)));
		double th3 = Math.atan2(y3, x3);
		double a3 = Math.toDegrees(th3);
		
		System.out.print("r3=" + r3 + " a3=" + a3);
		

	}

}
