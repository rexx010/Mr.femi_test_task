public class SundayMunchies{

//test 1
public static int findMultiple(int number){
number = number * 5;
return number;
}


//test 2
public static void displayPrimeNumber(){
 int number = 1000;
for(int counter = 2; counter <= number; counter++){
 int count = 0;
 int primeCounter = 0;

  for(int divider = 1; divider <= counter; divider++){
    if (counter % divider == 0){
      count++;
      }
    }
  if(count == 2){
  primeCounter++;
  System.out.printf("%d ", counter);
  }

}



//test 3
public static void displayAge(int ageYears){
int years = ageYears;
int months = years * 12;
int days = years * 365;
int minutes = 365 * 1440;
int seconds = minutes * 60;
System.out.println("Age is:"+years+" years, "+months+" Months, "+days+" Days, "+minutes+" Minutes, "+seconds+" Seconds");
System.out.println();  
}



//test 4
public static void displayDogAge(String name, int humanYear){
String dogName = name;
int dogYear = 7;
int result = dogYear * humanYear;
System.out.println("The name of the dog is "+dogName+" and the dog age is "+result);
}



//test 5
public static void findMultipleof7Not5(int number1, int number2){
for(int counter = number1; counter <= number2; counter++){
if (counter % 7 == 0 && counter % 5 != 0){
System.out.print(counter +" ,");
//return findMultipleof7Not5;
System.out.println();
}
}
}


//test 6
public static int computeSumOfNumber(int number1, int number2,int number3, int number4){
return number1 + number2 + number3 + number4;
}



//test 7
public static void isLeapYear(int year){
if(year % 4 != 0){
System.out.print(false+", not a leap year");
}else{
if(year % 100 != 0){
System.out.print(true+", it is a leap year");
}else{
if(year % 400 == 0){
System.out.print(true+", it is a leap year");
}else{
System.out.print(false+", not a leap year");
}
}
}

}
}