package overriding;

public class Main {

	public static void main(String[] args) {

		BaseCreditManager[] baseCreditManager= {new StudentsCreditManager(),new FarmCreditManager(),new TeacherCreditManager()};
		for (BaseCreditManager baseCreditManager2 : baseCreditManager) {
			System.out.println(baseCreditManager2.hesapla(1000));
		}
	}

}
