import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
	static Scanner sc = new Scanner(System.in);
	Addition1 addition;
	Substraction1 substraction;
	Multiplication1 multiplication;
	Modulus1 modulus;
	Division1 division;
	Square1 square;
	Cube cube;
	Factors1 factors;
	Average1 average;
	EvenOrOdd1 evenOrOdd;

	int operation;
	int number1;
	int number2;
	int number;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;

	public void getOperation() throws InputMismatchException {
		try {

			System.out.println(
					"Welcome to Console based application\n\n1. Addition of two numbers\n2. Substraction of two numbers\n"
							+ "3. Multiplication of two numbers\n4. Division of two numbers"
							+ "\n5. Modulus of two numbers\n6. Square of number"
							+ "\n7. cube of number\n8. Average of numbers"
							+ "\n9. Factors of numbers\n10.Find out even or odd number" + "\n\nEnter your Choice-");
			operation = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("<Please Try again With Valid Input>\n");
			sc.next();
			getOperation();
		}

	}

	public void getNumber() {
		try {
			System.out.println("Enter the First number");
			this.number1 = sc.nextInt();
			System.out.println("Enter the Second number");
			this.number2 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("<Please Try again With Valid Input>\n");
			sc.next();
			getNumber();
		}
	}

	public void getNumber2() {
		try {
			System.out.println("Enter any number");
			this.number = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("<Please Try again With Valid Input>\n");
			sc.next();
			getNumber2();
		}
	}

	public void getNumber3() {
		try {
			System.out.println("Enter first number");
			this.num1 = sc.nextInt();
			System.out.println("Enter second number");
			this.num2 = sc.nextInt();
			System.out.println("Enter third number");
			this.num3 = sc.nextInt();
			System.out.println("Enter fourth number");
			this.num4 = sc.nextInt();
			System.out.println("Enter fifth number");
			this.num5 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("<Please Try again With Valid Input>\n");
			sc.next();
			getNumber3();
		}
	}

	public void ChooseOperation() {

		addition = new Addition1();
		substraction = new Substraction1();
		multiplication = new Multiplication1();
		modulus = new Modulus1();
		division = new Division1();
		square = new Square1();
		cube = new Cube();
		average = new Average1();
		factors = new Factors1();
		evenOrOdd = new EvenOrOdd1();
		if (operation <= 10) {
			switch (operation) {
			case 1:
				addition.getAddition();
				break;
			case 2:
				substraction.getSubtraction();
				break;
			case 3:
				multiplication.getMultiplication();
				break;
			case 4:
				division.getDivision();
				break;
			case 5:
				modulus.getModulus();
				break;
			case 6:
				square.getSquare();
				break;
			case 7:
				cube.getCube();
				break;
			case 8:
				average.getAverage();
				break;
			case 9:
				factors.getFactors();
				break;
			case 10:
				evenOrOdd.getEvenOrOdd();
				break;

			}
		} else {
			System.out.println("invalid input");
		}
	}

	public void getAnotherOperation() {
		System.out.println("Do you want to perform another operation?\nYes/No");
		String operation2 = sc.next();
		if (operation2.equalsIgnoreCase("yes")) {
			getOperation();
			ChooseOperation();
			getAnotherOperation(); // Ask again if the user wants to perform another operation
		} else if (operation2.equalsIgnoreCase("no")) {
			System.out.println("Thank you!!");
		} else {
			System.out.println("Invalid Input");
			getAnotherOperation(); // Ask again if the input is invalid
		}
	}

	public static void main(String[] args) {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		simpleCalculator.getOperation();
		simpleCalculator.ChooseOperation();
		System.out.println("---------------------------------------------------------------");
		simpleCalculator.getAnotherOperation();
	}

}
