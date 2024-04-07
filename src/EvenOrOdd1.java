
public class EvenOrOdd1 extends SimpleCalculator implements EvenOrOdd{
	public void getEvenOrOdd() {
		getNumber2();
		if (number % 2 == 0) {
			System.out.println("It's Even Number");
		} else {
			System.out.println("It's Odd Number");
		}
}
}
