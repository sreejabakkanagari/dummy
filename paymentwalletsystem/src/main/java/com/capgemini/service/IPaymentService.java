package com.capgemini.service;

import com.capgemini.bean.Account;

public interface IPaymentService {
	public boolean createAccount(Account bean);
	public double withdrawAmount(double amount);
	public double depositAmount(double amount);
	public double showBalance(double amount);
	public void transferFunds(int accountnumber1,int accountnumber2);
}
