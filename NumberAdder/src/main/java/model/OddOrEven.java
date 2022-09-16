package model;

public class OddOrEven {
	private int number;
	private boolean oddOrEven;

	/**
	 * @param number
	 */
	public OddOrEven(int number) {
		super();
		this.number = number;
		setOddOrEven(number);
	}

	/**
	 * 
	 */
	public OddOrEven() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		setOddOrEven(number);
	}
	
	public void setOddOrEven(int number) {
		if(number % 2 == 0) {
			 oddOrEven = true;
		}else {
			oddOrEven = false;
		}
	}
	
	public boolean getOddOrEven() {
		return oddOrEven;
	}
	
	public String print() {
		if(oddOrEven) {
			return "Number is even";
		}else {
			return "Number is odd";
		}
	}
}
