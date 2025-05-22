public class SecondHighest{
public static void main(String[] args){

int []number = {9, 6, 8, 11, 12};

int highest = number[0];
int secondHighest = number[0];

for(int i = 1; i < number.length; i++){

if(number[i] > highest){

secondHighest = highest;

highest = number[i];
}else{
if(number[i] > secondHighest){
secondHighest = number[i];
}
}

}
System.out.print(secondHighest);

}
}