package com.capgemini.service;

import com.capgemini.bean.Account;
import com.capgemini.dao.PaymentDao;

public class PaymentService implements IPaymentService{
	PaymentDao dao=new PaymentDao();

	public boolean createAccount() {
		// TODO Auto-generated method stub
		
		
	}

	public double withdrawAmount(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double depositAmount(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double showBalance(int accountnumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void transferFunds(int cus_id1, int cus_id2) {
		// TODO Auto-generated method stub
		
	}

	public double showBalance(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean createAccount(Account bean) {
		// TODO Auto-generated method stub
		return false;
	}
}
	
	


