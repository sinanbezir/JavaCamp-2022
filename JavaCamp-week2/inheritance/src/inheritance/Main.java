package inheritance;

public class Main {

	public static void main(String[] args) {
		Employee employee =new Employee();
		Customer customer=new Customer();
		
		employee.id=1;
		customer.id=1;
		
		CustomerManager customerManager=new CustomerManager();
		EmployeeManager employeeManager=new EmployeeManager();
		
		employeeManager.add();
		customerManager.add();
	}

}
