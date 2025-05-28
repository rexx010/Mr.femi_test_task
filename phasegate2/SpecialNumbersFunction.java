public class SpecialNumbersFunction{

public static int add(int[] number){
int count = 0;
int sum = 0;
int counter = 0;

	for(int i = 0; i < number.length; i++){
		count = number[i];
		counter = 0;

		for(int j = 0; j < number.length; j++){
			if(number[i] == number[j]){
			counter++;
			}
		}

		if(counter < 2){
		sum = sum + count;
		}
	}

return sum;
}




}