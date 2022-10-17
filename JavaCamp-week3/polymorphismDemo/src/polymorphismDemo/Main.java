package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		/*BaseLogger[] baseLogger = new BaseLogger[] { new FileLogger(), new DatabaseLogger() };
		
		for (BaseLogger baseLogger2 : baseLogger) {
			CustomerManager customerManager=new CustomerManager(baseLogger2);
			customerManager.add();
		}*/
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
