
public class Addition1 extends SimpleCalculator implements Addition {
int result;
	@Override
	public void getAddition() {
		getNumber();

		this.result = number1 + number2;
		System.out.println("Addition is>> "+result);
		
	}

	

}
