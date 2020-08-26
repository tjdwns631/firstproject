package com.yedam.classes.exam;

public class Account {
	private int balance = 0;

	static final int max = 1000000;
	static final int min = 0;

	public Account() {

	}

	public Account(int balance) {
		this.balance = balance;

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= 0 && balance <= 1000000) {
			this.balance = balance;
		}
	}
}
