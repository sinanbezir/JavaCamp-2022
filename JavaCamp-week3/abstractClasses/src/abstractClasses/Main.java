package abstractClasses;

public class Main {

	public static void main(String[] args) {

			GameCalculater[] calculater = {new WomanGameCalculater(),new KidsGameCalculater(),new ManGameCalculater()} ;
			
			for (GameCalculater gameCalculater : calculater) {
				gameCalculater.hesapla();
			}
	}

}
