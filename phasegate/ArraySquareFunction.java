public class ArraySquareFunction{


public static int[] sort(int[] number){

int counter = 0;
for(int square = 0; square < number.length; square++){
	counter++;	
}

int[] squaredNumber = new int[counter];
for(int square = 0; square < squaredNumber.length; square++){
	squaredNumber[square] = number[square] * number[square];	
}


for(int index = 0; index < squaredNumber.length; index++){
	for(int count = 1; count < squaredNumber.length; count++){
	if(squaredNumber[count] < squaredNumber[count - 1]){
		int temp = squaredNumber[count];
		squaredNumber[count] = squaredNumber[count - 1];
		squaredNumber[count - 1] = temp;
		}
	}

}
return squaredNumber;

}
}