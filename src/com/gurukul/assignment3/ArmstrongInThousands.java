package com.gurukul.assignment3;

public class ArmstrongInThousands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<=10000;num++) {
			int n = num;
			int original = n;
			int temp = n;
			int power = 0;
			double sum = 0;
			
			while(n!=0) {
				power++;
				n = n/10;
			}
			while(temp!=0) {
				int digit = temp%10;
				sum = sum + Math.pow(digit, power);
				temp = temp/10;
			}
			if(original==sum)
				System.out.println(original);
		}

	}

}
