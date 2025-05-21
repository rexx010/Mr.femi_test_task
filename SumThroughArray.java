import java.util.Scanner;
import java.util.Arrays;
public class SumThroughArray{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the size of the array: ");
int num = input.nextInt();
if(num <= 0){
System.out.print("No input found");
}else{
int[] elements = new int[num];


System.out.print("Enter the elements of the array: ");
for(int i = 0; i < elements.length; i++){
elements[i] = input.nextInt();
}

System.out.print(Arrays.toString(SumThroughArrayFuntion.sum(elements)));

}


}
}