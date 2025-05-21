import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomatedTellerMachineTest{
private AutomatedTellerMachine atm = new AutomatedTellerMachine();
private Account johnsAccount;
private Account jamesAccount;
private Account bolajisAccount;


	@BeforeEach
	public void setUp(){

		System.out.print("Setting up the test");
		//pre-condition(s)
		johnsAccount = new Account("John", "0123456789", 50.00);

		jamesAccount = new Account("James", "9876543210", 50000.00);
	

		bolajisAccount = new Account("Bolaji", "1023456789", 500.00);
	

		Account [] accounts = {johnsAccount, jamesAccount, bolajisAccount};

		
		atm.setAccount(accounts);
	}


	@Test
	public void testCanWithdrawFunds(){
		//action
		atm.withdraw(jamesAccount.getAccountNumber(), 20000);
		//check(s)
		assertEquals(30000, jamesAccount.getBalance());
		
}


	@Test
	public void testWithdrawNegativeAmountThrowsException(){
		atm.wihdraw(accounts[1].getAccountNumber(), -30_000); 
		assertThrows();


}



}