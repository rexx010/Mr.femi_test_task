public class CategorizedNumberFunction{

public static int[] divisible(int[] digits, int divisibleBy){
int count = 0;
for(int checker = 0; checker < digits.length; checker++){
if(digits[checker] % divisibleBy == 0)count++;
}

int i = 0;
int[] divideableNums = new int[count];
for(int checker = 0; checker < digits.length; checker++){
if(digits[checker] % divisibleBy == 0){
divideableNums[i] = digits[checker];
i++;
}
}
return divideableNums;
}

}