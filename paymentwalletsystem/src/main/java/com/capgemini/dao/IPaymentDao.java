package com.capgemini.dao;

public interface IPaymentDao {
	public boolean createAccount();
	public double withdrawAmount(double amount);
	public double depositAmount(double amount);
	public double showBalance(double amount);
	public void transferFunds(int accountnumber1,int accountnumber2);
}
