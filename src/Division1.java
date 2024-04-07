
public class Division1 extends SimpleCalculator implements Division {
	public void getDivision() {
		getNumber();

		int result = number1 / number2;
		System.out.println("Division is>> "+result);
	}
}
