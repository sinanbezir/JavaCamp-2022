//bu proje verilen sayının mükemmel sayı olup olmadığını kontrol eden bir programdır.
//Mükemmel sayı kendisini tam bölenlerin toplamına eşit olan sayılara denir. Mesela 6 bölenleri 1,2,3 tür. 1+2+3=6 gibi
package miniProjeMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 8128;
		int sum = 0;
		
		for(int i=1;i<=number/2;++i) {
			if(number%i==0) {
				sum+=i;
			}
		}
		
		if(number==sum) {
			System.out.println(number + " Mükemmel sayıdır.");
		}
		else
			System.out.println(number + " Mükemmel sayı değildir..");

	}

}
