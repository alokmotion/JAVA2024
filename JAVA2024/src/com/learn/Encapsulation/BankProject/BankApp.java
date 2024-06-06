package com.learn.Encapsulation.BankProject;

public class BankApp {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setMoney(1);
		
		System.out.println(b.getMoney());

	}

}
