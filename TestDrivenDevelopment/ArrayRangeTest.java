public class ArrayRangeTest{



public static int[] length(int[] input){

int [] smallest = new int[1];
int [] largest = new int[1];
int [] range = new int[1];

smallest[0] = input[0];
largest[0] = input[0];

for(int counter = 1; counter < input.length; counter++){
	if(smallest[0] > input[counter])smallest[0] = input[counter];
	if(largest[0] < input[counter])largest[0] = input[counter];	
}
range[0] = largest[0] - smallest[0];

return range;

}



}