package app;

public class BankAccount 
{
String AccountHolderName;
double AccountBalance;
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public BankAccount(String accountHolderName, double accountBalance, int ID) {
	super();
	AccountHolderName = accountHolderName;
	AccountBalance = accountBalance;
	id = ID;
}
public String getAccountHolderName() {
	return AccountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	AccountHolderName = accountHolderName;
}
public double getAccountBalance() {
	return AccountBalance;
}
public void setAccountBalance(double accountBalance) {
	AccountBalance = accountBalance;
}
public String toString()
{
	return "Bankholder_name:" + AccountHolderName+" "+"Account balance is" + AccountBalance+ "Customer id:"  + " " +id;
	
}
}
