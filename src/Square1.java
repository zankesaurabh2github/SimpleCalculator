
public class Square1 extends SimpleCalculator implements Square{
	public void getSquare() {
		getNumber2();

		int result = number * number;
		System.out.println("Square is>> "+result);
	}


}
