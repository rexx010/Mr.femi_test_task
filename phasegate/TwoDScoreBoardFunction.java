public class TwoDScoreBoardFunction{

public static int[] scoreboard(int[][] number, int[] output){

int total = 0;
for(int count = 0; count < number.length; count++){
total = 0;
	for(int counter = 0; counter <= number.length; counter++){
	total = total + number[count][counter];
}
output[count] = total;
}
return output;
}


public static double[] scoreboard(int[][] number, double[] output){
double increament = 0;
for(int counter = 0; counter <= number.length; counter++){
increament++;
}


double total = 0;
double average = 0;
for(int count = 0; count < number.length; count++){
average = 0;
	for(int counter = 0; counter <= number.length; counter++){
	average = average + number[count][counter];
	average = average / number.length;
}
output[count] = average;
}
return output;
}




}



