package com.NatWest.AccessModifiers;

import java.util.ArrayList;

public class BankAccount {

	private String customer;
	private int ID;
	private double balance;

	BankAccount(String customer, int ID, double balance) {
		this.customer = customer;
		this.ID = ID;
		this.balance = balance;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [customer=" + customer + ", ID=" + ID + ", balance=" + balance + "]";
	}

    private ArrayList<BankAccount> accountList = new ArrayList<> ();
	
	public void deposit(double depositamount) {
		this.balance = balance + depositamount;
	}
	
	public void withdraw(double withdrawamount) {
		if(withdrawamount > this.balance) {System.out.println("Insufficient funds");}
		else {
		this.balance = balance - withdrawamount; }
	}

	public void addtolist(BankAccount customer) {
		accountList.add(customer);
		
}		
	public void printAll() {
		for (BankAccount cust:accountList) 
		System.out.println(cust);
}
}
	

//Bank account task:
//create a customer that has a balance, we want to be able to check balance
//deposit balance, and withdraw balance.
