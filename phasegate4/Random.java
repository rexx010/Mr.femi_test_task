import java.util.Scanner;

public class Random{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int counter = 0;
int correctAnswer = 0;
int wrongAnswer= 0;


for(counter = 0; counter <= 10; counter++){

int firstNumber = (int)(Math.random() * 100);
int secondNumber = (int)(Math.random() * 100);
int result = 0;



if(secondNumber > firstNumber){
int firstcopy = firstNumber;
firstNumber = secondNumber;
secondNumber = firstcopy;

result = firstNumber - secondNumber;
}else{
result = firstNumber - secondNumber;
}

int attempted = 0;
while(attempted < 2){

System.out.println("The first number is " + firstNumber+ " and the second number is " +secondNumber);

System.out.println("what is the answer?: ");
int userChoice = input.nextInt();

if(result == userChoice){
System.out.println("correct");
correctAnswer++;
attempted = 2;
}
if(result != userChoice){
System.out.println("invalid answer");
attempted = attempted + 1;
}


}


}
System.out.println("correct answer is" +correctAnswer+ "/ 10");


}
}