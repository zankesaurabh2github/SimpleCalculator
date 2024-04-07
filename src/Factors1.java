
public class Factors1 extends SimpleCalculator implements Factors {
	public void getFactors() {
		getNumber2();
		int store = 1;
		for (int i = 1; i <= number; i++) {
			store = store * i;
		}
		System.out.println("Factors are>> "+store);
	}
}
