package com.capgemini.paymentwalletsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.bean.Account;



/**
 * Hello world!
 *
 */
public class App 
{
	static Account bean= new Account();


	 static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance;

		
		
		
		while(true)
		{
			
			System.out.println("welcome to the payment App of XYZ Bank");
			System.out.println("1.create account");
			System.out.println("2.if account already exits");
			System.out.println("3.show balance");
			System.out.println("4.Deposit amount");
			System.out.println("5.withdraw amount");
			System.out.println("6.transfer funds");
			System.out.println("enter your choice");
			try {
				int choice=Integer.parseInt(br.readLine());
				
				switch(choice) {
				
				case 1:
					/*System.out.println("enter your username");
					String username=br.readLine();
					System.out.println("enter your password");
					String password=br.readLine();
					TestLogin();
				System.out.println("fill the details to create your account");
				int cust_id1=(int) (0+(Math.random() *(2000-0)));
				System.out.println("you have successfully created your account with cus_id  " +cust_id1);
				System.out.println(bean);
				*/
					bean.setUsername("sreeja");
					bean.setPassword("abckl");
				TestLogin();
				break;
				
				
				
				
				
				case 2:
					System.out.println("fill the below details to create your account");
					customerDetails();
					
					
					
					break;
				
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	private static void TestLogin() {
		// TODO Auto-generated method stub
		System.out.println("enter your username");
		try {
			String username=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("enter your password");
		try {
			String password=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestLogin();
	System.out.println("fill the details to create your account");
	int cust_id1=(int) (0+(Math.random() *(2000-0)));
	System.out.println("you have successfully created your account with cus_id  " +cust_id1);
	System.out.println(bean);
		
		
		
	}

	private static void depositAmount(int amount) {
		
		
	}

	private static void customerDetails() {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println("enter your first name");
			String firstname=br.readLine();
			System.out.println("enter your last name");
			String lastname=br.readLine();
			System.out.println("enter your email");
			String email=br.readLine();
			System.out.println("enter your mobilenumber");
			String mobilenumber=br.readLine();
			System.out.println("enter your adharnumber");
			int adharnumber=Integer.parseInt(br.readLine());
			System.out.println("your account is successfully created and will get to know your account number shortly");;
			
			
			bean.setFirstname(firstname);
			bean.setLastname(lastname);
			bean.setEmail(email);
			bean.setMobilenumber( Integer.parseInt(mobilenumber));
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
	



	
	
    {
      
   			   			
        
    


    }
}
    
