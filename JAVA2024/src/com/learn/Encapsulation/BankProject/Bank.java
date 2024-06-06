package com.learn.Encapsulation.BankProject;

public class Bank {
	private int money;
	
	public void setMoney(int amount) {
		if(amount >0) {
			money = amount;
		} else {
			System.out.println("Please Enter Vaild money which is greter than 0");
			System.exit(0);
		}
		
	}
	
	
	public int getMoney(){
		return money;
	}

}
