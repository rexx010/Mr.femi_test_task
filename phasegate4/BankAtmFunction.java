public class BankAtmFunction{
int []accounts = new int[4];
int []check = new int[accounts.length];


public static accountBalance(double balance){
	double amount = 0.0;
	amount = amount + balance;
	accounts[0] = amount;
	check[0] = balance;
	System.out.println("your current balance is: ", amount);
	return balance;
	}
	
public void withdrawal(double withdraw){
	int price = accounts[0];
	if(withdraw > price){
		System.out.println("Not enough balance");
	}

	double checker = accounts[0];
	checker = checker * 0.90;
	
	if(withdraw > checker){
		System.out.println("can't withdraw more than 90% of your balance at once");
	}else{
		double bal = accounts[0] - withdraw;
		System.out.println("Transaction succesful");
		System.out.println("withdrawal amount: ", withdraw);
		int charges = 100;
		bal = bal - charges;
		System.out.println("withdrawal fee:", charges);
		System.out.println("remaining balance:", bal);
		accounts[0] = bal;
		check[1] = withdraw;
	}
}

public static void transactions(){
	System.out.println("This are the list of your transactions");
	System.out.println(check);
}












}