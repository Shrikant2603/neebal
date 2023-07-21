package com.gurukul.day5;

import java.util.Scanner;

class Bank{
	private String name;
	private static int count=1000;
	private static int totalAm;
	private int accNo;
	private String branch;
	private double balance;
	
	Bank(String name, String branch, double balance){
		this.name = name;
		this.accNo = ++count;
		this.branch = branch;
		this.balance = balance;
		totalAm += balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double currentBalance() {
		return balance-1000;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		totalAm+=amount;
	}

	public void withdraw(double am) {
		// TODO Auto-generated method stub
		balance -= am;
		totalAm -= am;
		
	}

	public static int getTotalAm() {
		return totalAm;
	}

	public static void setTotalAm(int totalAm) {
		Bank.totalAm = totalAm;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Account no: " + accNo + ", Branch: " + branch + ", Balance=" + balance;
	}
	
}

public class BankOOP {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Bank  acc1=new Bank("Ram", "Bandra", 2500);
//		
//		acc1.deposit(2550);
//		
//		double bal=acc1.currentBalance();
//		
//		System.out.println(acc1.getName()+" has "+ bal+" amount");
//				// Ram has 5050 amount
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the amount to withdraw");
//		double am=sc.nextDouble();//4500
//		
//		if(acc1.currentBalance()>am)
//			acc1.withdraw(am);
//		else
//			
//			System.out.println("Insufficient fund"); //output .because Minimum balance 1000
//		
//		System.out.println("Details of the account holder"+ acc1);
//		
//		// Name: Ram Account Number 123456   Balance Rs.5050 Branch: Bandra 
//
//		
//		Bank  acc2=new Bank("Sita", "Bandra", 2000);
//		
//		acc2.deposit(2550);
//		
//		double bal1=acc2.currentBalance();
//		
//		System.out.println(acc2.getName()+" has "+ bal1+"amount");
//				// Sita has 4050 amount
//		
//		System.out.println("Enter the amount to withdraw");
//		double am1=sc.nextDouble();//2500
//		
//		if(acc2.currentBalance()>am1)
//			acc2.withdraw(am1);
//		else
//			System.out.println("Insufficient fund"); 
//		
//		System.out.println("Details of the account holder"+ acc2);
//		
//		
//		// Name: Sita Account Number 23456   Balance Rs.2050 Branch: Bandra 
//	}
	
	public static void main(String[] args) {
		Bank  acc1=new Bank("Ram", "Bandra", 2500);
		Bank  acc2=new Bank("Sita", "Bandra", 3500);
		Bank  acc3=new Bank("Rahim", "Bandra", 2800);
		Bank  acc4=new Bank("Rita", "Bandra", 5500);
		acc1.deposit(5000);
		acc2.deposit(2500);
		acc3.withdraw(1200);
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println(acc4);
		System.out.println("Amount available in the Bank is " + Bank.getTotalAm());
	}
}
