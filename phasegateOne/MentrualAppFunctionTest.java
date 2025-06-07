import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentrualAppFunctionTest{

	@Test
	public void startCycleFunctionExist(){
	int number = 1, num2 = 2, num3 = 3;
	MentrualAppFunction.begin(number, num2, num3);
}

	@Test
	public void startCycleFunctionReturnsCorrectOutput(){
	int number = 2025, num2 = 8, num3 = 13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Your cycle starts on the 2025-08-13";
	assertEquals(expected, output);
}

	@Test
	public void startCycleFunctionDontAcceptNegativeValue(){
	int number = -2025, num2 = -8, num3 = -13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Invalid input";
	assertEquals(expected, output);
}


	@Test
	public void checkForYearValueIsNotMoreThan5OrLessThan4(){
	int number = 20255, num2 = 0, num3 = 13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Year can't have more than 5 digits";
	assertEquals(expected, output);
}

	@Test
	public void checkForMonthValueIsNotMoreThan12OrLessThan1(){
	int number = 2025, num2 = 13, num3 = 13;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Months can't have more than 12";
	assertEquals(expected, output);
}

	@Test
	public void checkForDaysValueIsNotMoreThan12OrLessThan1(){
	int number = 2025, num2 = 12, num3 = 35;
	String output = MentrualAppFunction.begin(number, num2, num3);
	String expected = "Days can't have more than 30 or 31";
	assertEquals(expected, output);
}



}