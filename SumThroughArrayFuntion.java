public class SumThroughArrayFuntion{
public static int[] sum(int[] elements){

int counter = 0;
int[] min = new int[1];
int[] max = new int[1];

for(int i = 0; i < elements.length; i++){
counter++;	
}

int[] sum = new int[counter];
for(int i = 0; i < elements.length; i++){
	for(int j = 0; j < elements.length; j++){
	sum[i] = sum[i] + elements[j];
	}
sum[i] -= elements[i];
}
	
min[0] = sum[0];
max[0] = sum[0];
for(int count = 1; count < sum.length; count++){
if(max[0] > sum[count])max[0] = sum[count];
if(min[0] < sum[count])min[0] = sum[count];
}

int[] ans = new int[2];
ans[1]=min[0];
ans[0]= max[0];


return ans;
}









}