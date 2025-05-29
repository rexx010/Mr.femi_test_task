public class UnsortedListFunction{
public static int[] sorted(int[] num1, int[] num2){


int[]num3 = new int[num1.length + num2.length];
for(int i = 0; i < num1.length; i++){
	num3[i] = num1[i];
}
for(int j = 0; j < num2.length; j++){
	num3[j + num1.length] = num2[j];
}

for(int index = 0; index < num3.length; index++){
	for(int count = 1; count < num3.length; count++){
	if(num3[count] < num3[count - 1]){
		int temp = num3[count];
		num3[count] = num3[count - 1];
		num3[count - 1] = temp;
		}
	}
}

return num3;

}
}