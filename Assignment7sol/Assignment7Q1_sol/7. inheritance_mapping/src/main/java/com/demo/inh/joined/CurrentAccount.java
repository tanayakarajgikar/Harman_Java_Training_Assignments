package com.demo.inh.joined;

public class CurrentAccount extends Account {
	
	private double overdraft;

	public CurrentAccount(String accountHolderName, double balance, double overdraft) {
		super(accountHolderName, balance);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public CurrentAccount() {}

	@Override
	public String toString() {
		return   super.toString()+": "+ overdraft;
	}


	
}