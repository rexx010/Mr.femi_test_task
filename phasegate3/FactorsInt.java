public class FactorsInt{
public static void main(String[] args){

int num = 7;
int []total = {};

for(int counter = 1; counter <= num; counter++){
if(num % counter == 0){
total[counter] = counter;
System.out.print(total);
}
}

}

}