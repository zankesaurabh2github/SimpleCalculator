
public class Average1 extends SimpleCalculator implements Average{
	public void getAverage() {
		getNumber3();
		
		float result;

		result = (num1+ num2+ num3+ num4+ num5)/5;
		System.out.println("Average is>> "+result);
	}


}
