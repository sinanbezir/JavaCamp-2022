package deneme.dataAccess.hibernate;

import deneme.dataAccess.CategoryDao;
import deneme.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("kategori hibernate ile eklendi: " + category.getName());
	}
}
