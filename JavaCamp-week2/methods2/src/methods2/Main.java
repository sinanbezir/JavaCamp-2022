package methods2;

public class Main {

	public static void main(String[] args) {
		int result = topla(5, 7);
		System.out.println(result);
		
		int result2=topla2(5,6,10,8,6,5,7);
		System.out.println(result2);
		
		int result3=topla2();
		System.out.println(result3);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void güncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int num1, int num2) {
		return num1 + num2;
	}

	public static int topla2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}
}
