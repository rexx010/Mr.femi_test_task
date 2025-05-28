import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialNumbersTest{

	@Test
	public void functionExists(){

	int[] number = {9, 6, 8, 11, 12};

	SpecialNumbersFunction.add(number);

	}


	@Test
	public void getCorrectSum(){

	int[] number = {1, 2, 3, 2,5,6};

	int expected = 15;

	int output = SpecialNumbersFunction.add(number);
	assertEquals(expected, output);
}

	@Test
	public void checkForNoSpecialDigits(){

	int[] number = {3, 2, 3, 2};

	int expected = 0;

	int output = SpecialNumbersFunction.add(number);
	assertEquals(expected, output);
}


}