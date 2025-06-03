import java.util.Scanner;

public class BankAtm{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


//boolean hi = true;
while(true){
	String message = """
welcome to my bank app
press 1 to deposit
press 2 to withdraw
press 3 Transactions
press 0 to exit
			""";
	System.out.println(message);
	int userchoice = input.nextInt();
	switch(userchoice){

		case 1:
	
			String message1 = """
			choose a number
			press 1 to deposit
			press 0 to go back
					""";
			System.out.println(message1);
			
			int choice1 = input.nextInt();
			switch(choice1){
				
				case 1:
					String message2 = """
					Enter amount
					""";
					System.out.println(message2);
					double user_amount = input.nextInt();
					BankAtmFunction.accountBalance(user_amount);
					break;	
					
				default:
					System.out.println("invalid input");
					break;

}//switch case for case 1

		case 2:
			while(true){
				String message3 = """
				press amount to withdraw in multiple of 500 or 1000

				press 1 for 500
				press 2 for 1000
				press 0 to exit
				""";
				System.out.println(message3);
				choice1 = input.nextInt();
				switch(choice1){
			
					case 1:
						String message4 = """
						press 1 for 5000
						press 2 for 10000
						press 3 for 15000
						press 4 for 20000
						""";
						System.out.println(message4);
						choice1 = input.nextInt();
						switch(choice1){
							case 1:
								double five_thousand = 5000.0;
								BankAtmFunction.withdrawal(five_thousand);
								break;
							case 2:
								double ten_thousand = 10000.0;
								BankAtmFunction.withdrawal(ten_thousand);
								break;
							case 3:
								double fifteen_thousand = 15000.0;
								BankAtmFunction.withdrawal(fifteen_thousand);
								break;
							case 4:
								double twenty_thousand = 20000.0;
								BankAtmFunction.withdrawal(twenty_thousand);
								break;
							default:
								System.out.println("Invalid amount");
								break;
							}



					case 2:
						String message5 = """
						press 1 for 5000
						press 2 for 10000
						press 3 for 15000
						press 4 for 20000	
						""";
						System.out.println(message5);
						choice1 = input.nextInt();
						switch(choice1){
							case 1:
								double five_thousand = 5000.0;
								BankAtmFunction.withdrawal(five_thousand);
								break;
							case 2:
								double ten_thousand = 10000.0;
								BankAtmFunction.withdrawal(ten_thousand);
								break;
							case 3:
								double fifteen_thousand = 15000.0;
								BankAtmFunction.withdrawal(fifteen_thousand);
								break;
							case 4:
								double twenty_thousand = 20000.0;
								BankAtmFunction.withdrawal(twenty_thousand);
								break;
							default:
								System.out.println("Invalid amount");
								break;
}

					case 0: 
						break;

					default:
						System.out.println("Invalid input");
						break;
}//switchcase 3
}//while loop 2

		case 3:
			BankAtmFunction.transactions();
			break;

		case 0:
			break;
		default:
			System.out.println("invalid input");
			break;
	}//while true 1
	
	

}//switch case 1

}
}
