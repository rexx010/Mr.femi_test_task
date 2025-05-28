import java.util.Arrays;

public class WordOfCharacter{
public static void main(String[] args){

int[] number = {1,2,3,2,3};
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
System.out.print(sum);


}
}