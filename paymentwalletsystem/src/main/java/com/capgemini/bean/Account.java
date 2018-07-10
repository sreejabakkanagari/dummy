package com.capgemini.bean;

public class Account {
private String username;
private String password;
	public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	private String firstname;
	private String lastname;
	private double mobilenumber;
	private String Email;
	private int accountnumber;
	private double amount;
	private int cust_id;
	private int adharnumber;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(int adharnumber) {
		this.adharnumber = adharnumber;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private int cus_id;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(double mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", mobilenumber=" + mobilenumber + ", Email=" + Email + ", accountnumber=" + accountnumber
				+ ", amount=" + amount + ", cust_id=" + cust_id + ", adharnumber=" + adharnumber + ", cus_id=" + cus_id
				+ "]";
	}
	
	
}
