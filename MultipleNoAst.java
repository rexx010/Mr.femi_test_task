import java.util.Scanner;

public class MultipleNoAst{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer value: ");
int num1 = input.nextInt();
System.out.print("Enter an integer value: ");
int num2 = input.nextInt();

int result = 0;
for(int count = 1; count <= num2; count++){
result += num1;
}
System.out.print(result);

}
}