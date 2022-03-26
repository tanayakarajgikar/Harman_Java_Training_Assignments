package com.demo.inh.joined;

public class SavingAccount extends Account {
	
	private double intrestRate;

	public SavingAccount(String accountHolderName, double balance, double intrestRate) {
		super(accountHolderName, balance);
		this.intrestRate = intrestRate;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	@Override
	public String toString() {
		return   super.toString()+": "+ intrestRate;
	}

	public SavingAccount() {}

	

}
