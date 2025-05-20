import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CategorizedNumberTest{

@Test
public void checkDivideable(){
int[] categories = {10, 15, 21, 30};
int divide = 5;
int[] expected = {10, 15, 30};
int[] output = CategorizedNumberFunction.divisible(categories, divide);
assertArrayEquals(expected, output);


}









}