import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestIndexFunctionTest{

	@Test
	public void functionExits(){
	int[] numbers = {1, 5, 3, 4, 5, 5};
	SmallestIndexFunction.index(numbers);
}

	@Test
	public void correctAnswer(){
	int[] numbers = {1, 5, 3, 4, 5, 5};
	int output = SmallestIndexFunction.index(numbers);	
	int expected = 1;
	assertEquals(expected, output);
}


	@Test
	public void noAnswer(){
	int[] numbers = {0, 0, 0, 0, 0, 0};
	int output = SmallestIndexFunction.index(numbers);	
	int expected = 0;
	assertEquals(expected, output);
}


}