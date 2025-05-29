public class SmallestIndexFunction{
public static int index(int[] numbers){

int largest = numbers[0];
int count = 0;


for(int counter = 0; counter < numbers.length; counter++){

if(largest < numbers[counter] && numbers[counter] != largest){
largest = numbers[counter];

count = counter;
}

}
return count;

}
}