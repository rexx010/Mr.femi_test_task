import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomatedTellerMachineTest{

	@Test
	public void testCanWithdrawFunds(){
		//pre-condition(s)
		Account johnsAccount = new Account("John", "0123456789", 50.00);

		Account jamesAccount = new Account("James", "9876543210", 50000.00);
	

		Account bolajisAccount = new Account("Bolaji", "1023456789", 500.00);
	

Account [] accounts = {johnsAccount, jamesAccount, bolajisAccount};

		AutomatedTellerMachine atm = new AutomatedTellerMachine();
		
		atm.setAccount(accounts);

		//action

		atm.withdraw(jamesAccount.getAccountNumber(), 20000);

		//check(s)

		assertEquals(30000, jamesAccount.getBalance());
		
}






}