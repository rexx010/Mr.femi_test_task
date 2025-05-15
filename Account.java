public class Account{
	private double balance;
	private String name;
	private String accountNumber;

	public Account(String name, String accountNumber, double balance){
		this.balance = balance;
		this.name = name;
		this.accountNumber = accountNumber;

}

	public double getBalance(){
	return balance;
}


	public String getAccountNumber(){
	return null;
}


	public void withdraw(double amount){
	this.balance = balance - amount;
	
	}






}