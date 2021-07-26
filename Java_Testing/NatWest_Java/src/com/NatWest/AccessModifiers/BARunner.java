package com.NatWest.AccessModifiers;

public class BARunner {

	public static void main(String[] args) {
		BankAccount customer = new BankAccount(null, 0, 0);
		
		BankAccount David = new BankAccount("David", 8047491, 50000.00d);
		
		BankAccount Andy = new BankAccount ("Andy", 512048, 5000.00);
		
		BankAccount June = new BankAccount ("June", 5632154, 4500.00d);
		
//		System.out.println(customer.getBalance());
		customer.withdraw(5000);
		customer.addtolist(David);
		customer.addtolist(Andy);
		customer.addtolist(June);
		customer.printAll();
	}
		
}


