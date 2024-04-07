
public class Cube extends SimpleCalculator implements Cube1{
	public void getCube() {
		getNumber2();

		int result = number * number * number;
		System.out.println("Cube is>> "+result);
	}

}
