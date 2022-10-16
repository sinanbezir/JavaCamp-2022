//projemiz verilen bir karakterin ince sesli mi? yoksa Kalın sesli harf mi olduğunu bulan bir programdır.
//bu projeyi hem "if" yapısı hem de "switch" yapısı kullanarak gerçekleştirdim.

package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='E';
		
		harf=Character.toLowerCase(harf);//java case sensitive olduğu için değeri tek tipe çevirdim
		
		System.out.println("------------- İf Yapısı -------------");

		if(harf=='e'||harf=='i'||harf=='ö'||harf=='ü') {
			System.out.println("Harf ince sesli bir harftir.\n");
		}
		
		else if(harf=='a'||harf=='ı'||harf=='o'||harf=='u') {
			System.out.println("Harf ince sesli bir harftir.\n");
		}
		else
			System.out.println("yanlış bir harf girdiniz!!!\n");
		
		
		
		System.out.println("------------- Switch Yapısı -------------");
		switch (harf) {
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':{
			System.out.println("Harf ince sesli bir harftir.\n");
			break;
		}
		case 'a':
		case 'ı':
		case 'o':
		case 'u':{
			System.out.println("Harf ince sesli bir harftir.\n");
			break;
		}
		default:
			System.out.println("yanlış bir harf girdiniz!!!\n");
		}
		
	}

}
