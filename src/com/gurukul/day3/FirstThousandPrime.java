package com.gurukul.day3;

import java.util.Scanner;

public class FirstThousandPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<=1000;n++) {
			boolean prime = true;
			for(int i=2;i<=Math.sqrt(n);i++) {
				int x = n%i;
				if(x==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println(n);
			}
		}

	}

}
