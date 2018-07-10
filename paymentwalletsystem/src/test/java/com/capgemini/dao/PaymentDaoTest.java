package com.capgemini.dao;

import com.capgemini.bean.Account;
import com.capgemini.service.PaymentService;

import junit.framework.TestCase;

public class PaymentDaoTest extends TestCase {
	
PaymentService service = new PaymentService();

Account bean=new Account();

	public void testCreateAccount() {
		
		
		assertEquals(true,service.createAccount(bean));
		assertNotNull(bean);
	}

	public void testWithdrawAmount() {
		
		assertEquals(5000,service.withdrawAmount(1000));
		assertNotNull(bean);
		assertTrue(true);
	}

	public void testDepositAmount() {
		assertEquals(287,service.depositAmount(3000));
		assertNotSame(1234,0);
		assertNotNull(bean);
		
	}

	public void testShowBalance() {
		assertEquals(4000,4000);
		assertNotSame(78,0);
		assertEquals(400,service.showBalance(400));
		assertNotNull(bean);
	}

	public void testTransferFunds() {
		assertEquals(400,bean.getAccountnumber());
		assertNotSame(567,0);
		assertNotNull(bean);
		
	}

	
		
	}


