package model;

public class AddNumber {

	private int number1;
	private int number2;
	private int number3;

	public AddNumber() {
		super();
	}

	public AddNumber(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		setNumber3(number1, number2);
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public void setNumber3(int number1, int number2) {
		number3 = number1 + number2;
	}
	
	public int getNumber3() {
		return number3;
	}
	
	public int addNumbers() {
		return number1+number2;
	}
	
	
}
