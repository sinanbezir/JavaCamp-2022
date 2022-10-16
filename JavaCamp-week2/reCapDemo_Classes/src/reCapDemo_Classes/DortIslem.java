package reCapDemo_Classes;

public class DortIslem {
	public int topla(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public int subtract(int number1, int number2) {
		return number1 - number2;
	}
	
	public int multiply(int... numbers) {
		int total = 1;
		for (int number : numbers) {
			total *= number;
		}
		return total;
	}
	
	public int divide(int number1, int number2) {
		return number1 / number2;
	}
}
