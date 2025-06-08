import java.util.Scanner;
import java.util.Arrays;

public class CheckOutApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String message = """
WELCOME TO SEMICOLON STORE:
===========================

Press 1 to enter the purchase details.
Press 2 to display customers invoice.
press 3 to print receipt.
press 0 to close app.
""";

boolean hold = true;
while(hold){
System.out.println(message);
int userChoice = input.nextInt();
switch(userChoice){
case 1:
	String output = """
Enter each product detials in the user's cart...
================================================""";
	System.out.println(output);
	
	String product = null;
	int pieces = 0;
	int price = 0;
	String decision = "yes";

	System.out.println("What is the customer's name?");
	String customerName = input.next();

	do{
	System.out.println("What did the user buy?");
	System.out.println("rice\nbeans\ngarri\ntomato");
	product = input.next();

	System.out.println("How many pieces?");
	pieces = input.nextInt();

	System.out.println("How much per unit?");
	price = input.nextInt();

	System.out.println("Add more items?");
	decision = input.next();

	}while(decision.equals("yes"));

	System.out.println("What is your name?");
	String cashierName = input.next();

	System.out.println("How much discount will he/she get?");
	int discount = input.nextInt();
	String[] nameOut = CheckOutAppFunction.named(customerName, cashierName);
	String[][] productInfo = CheckOutAppFunction.productBox(product, pieces, price);
	System.out.println(Arrays.toString(nameOut));
	System.out.println(Arrays.toString(productInfo));
	
	
	break;

case 0:
	hold = false;
	System.out.print("GoodBye");
	break;
default:
	System.out.print("Invalid input");


}


}
}

}