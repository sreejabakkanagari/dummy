package com.capgemini.bean;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	Account account1=new Account();

	public void testGetFirstname() {
		assertEquals("valid","sreeja",account1.getFirstname());
		assertNotSame("sreeja","");
		assertNotNull(account1);
		assertSame("sreeja",1234);
	}

	public void testGetLastname() {
		assertEquals("valid","reddy",account1.getLastname());
		assertNotSame("reddy", "");
		assertNotNull(account1);
		assertNotSame("reddy",1234);
		
	}

	public void testGetMobilenumber() {
		assertEquals(789341,account1.getMobilenumber());
		assertNotSame(78934,0);
		assertNotSame(78934,123);
		assertNotNull(account1);
	}

	public void testGetEmail() {
		assertEquals("abc@gmail.com",account1.getEmail());
	
		assertNotSame("abc@gmail.com", "");
		assertNotNull(account1);
		
		
		
	}

	public void testGetAccountnumber() {
		assertNotSame("123456789",0);
		assertEquals(12345,account1.getAccountnumber());
		assertNotNull(account1);
	}

	public void testGetAmount() {
		assertNotSame(400,0);
		assertEquals(67889,account1.getAmount());
		assertNotNull(account1);
	}

	public void testGetCust_id() {
		assertNotSame(456,0);
		assertEquals(456,account1.getCust_id());
		assertNotNull(account1);
	}
	public void testGetAdharcardNumber() {
		assertEquals(67899565,account1.getAdharnumber());
		assertNotSame(67899565,0);
		assertNotNull(account1);
		assertSame("aadharnumber",123456,123456);
	}

}
