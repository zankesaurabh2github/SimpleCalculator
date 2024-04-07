
public class Multiplication1 extends SimpleCalculator implements Multiplication {
	public void getMultiplication() {
		getNumber();

		int result = number1 * number2;
		System.out.println("Multiplication is>> "+result);
	}

}
