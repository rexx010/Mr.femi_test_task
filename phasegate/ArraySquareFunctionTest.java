import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySquareFunctionTest{

	@Test
	public void functionExists(){
	int[] number = {9, 2, 7, 0, 5};

	ArraySquareFunction.sort(number);
	}

	@Test
	public void squaredNumber{
		
	int[] number = {9, 2, 7, 0, 5};
	int[] expected = {0, 4, 25, 49, 81};
	int[] output = ArraySquareFunction.sort(number);
	assertArrayEquals(expected, output);
	}

	@Test
	public void squaredNumber2{
		
	int[] number = {9, 2, -7, 0, 5};
	int[] expected = {0, 4, 25, 49, 81};
	int[] output = ArraySquareFunction.sort(number);
	assertArrayEquals(expected, output);
	}

	


}