public class LargestArray{
public static void main(String[] args){

double[][] numbers = {{1.5, 2.3, 3.7, 4.6}, {5.1, 6.2, 7.3, 8.4}, {9.5, 10.1, 11.8, 12.7}};

double value = 0;

for(int i = 0; i < numbers.length; i++){
	for(int j = 0; j < numbers.length; j++){
		value = numbers[i][j];
		if(numbers[i][j] > value){
		value = numbers[i][j];
		}


	}
}
System.out.print(value);
}


}