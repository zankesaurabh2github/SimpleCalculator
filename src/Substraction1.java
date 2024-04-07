
public class Substraction1 extends SimpleCalculator implements Substraction {
	public void getSubtraction() {
		getNumber();

		int result = number1 - number2;
		System.out.println("Substraction is>> "+result);
	}
}
