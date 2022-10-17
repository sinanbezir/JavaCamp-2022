package oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.core.loging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Xiaomi", 500);
		//List<Logger> loggers = Arrays.asList(new DatabaseLogger(),new MailLogger(),new FileLogger());
		Logger[] loggers= {};

		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
	}

}
