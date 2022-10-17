package deneme.business;

import java.util.ArrayList;
import java.util.List;

import deneme.core.loging.Logger;
import deneme.dataAccess.CategoryDao;
import deneme.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	

	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	
	private List<String> categoryNames = new ArrayList<>();

	public void add(Category category) throws Exception {
		for (String categoryName : categoryNames) {
			System.out.println(categoryName);
			if (categoryName == category.getName()) {
				throw new Exception("Bu kategori zaten ekli!!!");
			}

		}
		
		System.out.println("Categories: ");
		categoryNames.add(category.getName());
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		System.out.println();
	}
}
