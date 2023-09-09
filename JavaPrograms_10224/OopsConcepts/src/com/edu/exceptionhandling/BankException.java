package com.edu.exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class WithdrawException extends Exception{	
	public WithdrawException(String w) {
		super(w);
	}
}

public class BankException {

	public static void main(String[] args) throws WithdrawException {
		int amt;
		float balance = 5000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the withdraw amount: ");
		amt = sc.nextInt();
		
		if (amt <= 0) {
			throw new WithdrawException("Amount should not be less than or equal to zero");
		}
		else if (amt > balance) {
			throw new WithdrawException("Insufficient balance");
		}
		else {
			System.out.println("Take the amount... " + amt);
			balance -= amt;
			System.out.println("Your balance is " + balance);
		}
	}
}
