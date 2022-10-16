package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 5, 6, 2, 7, 9 };
		int aranacaksayi = 2;
		boolean result = false;

		for (int i = 0; i < sayilar.length; ++i) {
			if (sayilar[i] == aranacaksayi) {
				result = true;
				break;
			}
			
		}
		
		mesajVer(result);

		
	}
	
	public static void mesajVer(boolean result) {
		if (result) {
			System.out.println("Sayı Bulundu!!!");
		} else {
			System.out.println("Say Bulunamadı!!!!!!!!");
		}
	}

}
