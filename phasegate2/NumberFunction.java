import java.util.*;

public class NumberFunction{

public static int digits(String[] number){

//String digits[] = {number};
String output = "";

int count = 0;
int num = 0;

for(int counter = 0; counter < number.length; counter++){



for(int i = 0; i < number.length; i++){
if(counter == num){
count++;
}
num += 1;


}

output += count;
}
return count;
}


}