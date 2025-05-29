import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OccurrenceSFunctionTest{

	@Test
	public void functionExist(){
	String number = "Hello world";
	char letter = '0';
	OccurrenceSFunction.number(number, letter);


}

	@Test
	public void testThatTheAnswerIsAcurate(){
	String number = "Hello world";
	char letter = 'o';
	int output = OccurrenceSFunction.number(number, letter);
	int expected = 2;
	assertEquals(expected, output);


}




}