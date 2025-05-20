import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayRangeTestJ{


	@Test
	public void getTheRange(){

	ArrayRangeTest pass = new ArrayRangeTest();
		int [] range = {15, 6, 10, 15, 20};
 
			int [] expected = {14};

	int [] output = pass.length(range);

	assertArrayEquals(expected, output);




}













}