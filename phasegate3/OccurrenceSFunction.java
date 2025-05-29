public class OccurrenceSFunction{

public static int number(String word, char letter){

String word2 = word.toLowerCase();
int counter = 0;

for(int i = 0; i < word2.length(); i++){


if(letter == word.charAt(i)){
counter++;
}

}

return counter;

}
}