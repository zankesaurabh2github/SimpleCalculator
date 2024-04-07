
public class Modulus1 extends SimpleCalculator implements Modulus {
	public void getModulus() {
		getNumber();

		int result = number1 % number2;
		System.out.println("Modulus is>> "+result);
	}
}
