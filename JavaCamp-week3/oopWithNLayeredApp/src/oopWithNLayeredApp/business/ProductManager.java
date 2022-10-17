package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

//İş kuralları yazılacak

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürünün fiyatı 10 dan küççük olamaz!!!!");
		}

		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
