import java.util.Scanner;
import java.util.Arrays;

public class CategorizedNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
/*
System.out.print("Enter the length of the array: ");
int num = input.nextInt();

int[] numbers = new int[num];

System.out.print("Enter the index values: ");
for(int counter = 0; counter < num; counter++){
numbers[counter] = input.nextInt();
}*/
int[] numbers = {10, 15, 21, 30};
int divisibleBy = 5;

System.out.print(Arrays.toString(CategorizedNumberFunction.divisible(numbers, divisibleBy)));
}
}