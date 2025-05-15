public class AutomatedTellerMachine{
	private Account[] accounts;
	public void setAccount(Account[] accounts){
		this.accounts = accounts;
	}

	public void withdraw(String accountNumber,double amount){
		//1. look fo account with given accountNumber
		for(int index = 0; index < accounts.length; index++){
			Account foundAccount = accounts[index];
			String foundAccountNumber = foundAccount.getAccountNumber();
			if(foundAccountNumber == accountNumber){
				foundAccount.withdraw(amount);

			}


		}

		//2a. if account is not found, report error to user

		//2. if account found, subtract given amount from account balance
	}

}