import java.util.Scanner;
import java.time.LocalDate;

public class MentrualApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String message = """
Welcome to Phasegate Menstrual cycle calculator...

press any of the following to perform an action

1: to check calculate the date of your menstrual cycle.
2: to know your flow date.
3: to know your safe period.
4: to know your ovulation date.
0: to exit the app.
""";

boolean condition = true;
while(condition){
System.out.print(message);
int userChoise = input.nextInt();
switch(userChoise){
case 1:
	System.out.println("Welcome to your calculater \n Enter your start date in this order(year, month, day): ");
	int year = input.nextInt();
	int month = input.nextInt();
	int day = input.nextInt();
	System.out.println("How many days is your cycle?: ");
	int cycle = input.nextInt();
	LocalDate status = MentrualAppFunction.begin(year, month, day);
	LocalDate end = MentrualAppFunction.finish(year, month, day, cycle);
	String ovu = MentrualAppFunction.ovulation(year, month, day, cycle);
	System.out.println("Your cycle starts on the "+status);
	System.out.println("and your cycle ends on the "+end);
	System.out.println(ovu);
	break;
case 2:
	//String ovu = MentrualAppFunction.ovulation;
	//System.out.println(ovu);
	break;
case 3:
	System.out.println("Welcome to your calculater \n Enter your start date: ");
	int start = input.nextInt();
	break;
case 4:
	System.out.println("Welcome to your calculater \n Enter your start date: ");
	start = input.nextInt();
	break;
case 0:
	condition = false;
	break;
default:
	System.out.println("invalid input... Try again");
	break;

}






}

}
}