package methodOverloading;

public class DortIslem {

	public int Add(int num1, int num2) {
		return num1 + num2;
	}

	public int Add(int... numbers) {
		int total = 0;
		for (int i : numbers) {
			total += i;
		}
		return total;
	}
}
