package com.omkar.bank; // its collection of logical classes

public class BankAccount
{   
	//static variable
	// static member gets loaded at time when class gets loaded
	private static int autoAccountNo;
	//instance variable/ class variable
	
	private  int accountNo;
	private String accountHolderName;
	private double accountBalance;
    
	//init block
	{
	accountNo=++autoAccountNo;
	}
	
	//constructor overloading: offering end user with variety; bank
	//default constructor
	public BankAccount() //automatically called when object is created hence automatically initialises instance variables
	{    
		// before object creation itself
    	accountHolderName="Unknown";
		accountBalance=0;
		System.out.println(this.accountNo);
	}
	
	// parameterized constructor
	public BankAccount(String accountHolderName, double accountBalance)
	{
      //ex: bank only after providing information
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;	
		System.out.println(this.accountNo);
		
	}
	
	//
	// this is re-initializing the member variables//setter_method; update initialize, reinitialise variable 
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	} 
	
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
 //service methods
	public void withdraw(double amount)
	{
		if(amount<0 || amount==0)
		{
			System.out.println("invalid");
		}
		else if(accountBalance-amount<1000)
		{
			System.out.println("invalid");
		}
		else{
			this.accountBalance-=amount;
			System.out.println("balance after with drawing"+" " + accountBalance);
		}
		
	}
	public void  deposit(double amount)
	{
		if(amount<0 || amount==0)
		{
			System.out.println("you have entered a invalid amount");
		}
		else
		{	
		this.accountBalance+=amount;
		System.out.println("total balance after deposition" +" " +accountBalance);
		}
	}
	public static void main(String [] args)
	{
		//BankAccount acc = new BankAccount();
		
		BankAccount acc2 = new BankAccount("5656", 1500);
		acc2.withdraw(500);
		acc2.deposit(500);
	}
}


