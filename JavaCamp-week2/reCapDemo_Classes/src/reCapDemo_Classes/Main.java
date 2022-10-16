package reCapDemo_Classes;

public class Main {
	public static void main(String[] args) {
		DortIslem dortIslem=new DortIslem();
		int result;
		result=dortIslem.topla(5,8,9);
		System.out.println(result);
		
		result=dortIslem.subtract(15,8);
		System.out.println(result);
		
		result=dortIslem.multiply(5,8,9);
		System.out.println(result);
		
		result=dortIslem.divide(18,2);
		System.out.println(result);
	}
}
