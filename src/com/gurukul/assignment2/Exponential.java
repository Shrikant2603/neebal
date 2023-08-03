package com.gurukul.assignment2;

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a value");
	double x = sc.nextDouble();
	System.out.print("Enter a limit");
	int number = sc.nextInt();
	double sum = 1;
	double fact = 1;
	for (int i = 1; i <= number; i++) {
	    fact = fact * i;
	    sum = sum + (Math.pow(x, i) / fact);
	}
	System.out.print(sum);
    }
}
