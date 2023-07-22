package com.gurukul.day6;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int n = sc.nextInt();

	double x[] = new double[n];
	double sum = 0;

	for (int i = 0; i < n; i++) {
	    System.out.println("Enter the number");
	    double y = sc.nextInt();
	    x[i] = y;
	    sum += y;
	}
	double avg = sum / n;

	double var = 0;

	for (int i = 0; i < n; i++) {
	    var += Math.pow(x[i] - avg, 2);
	}
	var /= n;

	double sd = Math.sqrt(var);

	System.out.println(sum);
	System.out.println(avg);
	System.out.println(var);
	System.out.println(sd);

    }

}
