public class ArraySortFunction{


public static int[] sort(int[] number){


for(int i = 0; i < number.length - 1; i++){
int min = number[i];
int pointmin = i;

	for(int j = i; j < number.length; j++){
		if(min > number[j]){
		min = number[j];
		pointmin = j;
		}
	}
if(pointmin != i){
number[pointmin] = number[i];
number[i] = min;

}

}


return number;

}
}