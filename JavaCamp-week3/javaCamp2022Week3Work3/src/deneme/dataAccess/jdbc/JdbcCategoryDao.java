package deneme.dataAccess.jdbc;

import deneme.dataAccess.CategoryDao;
import deneme.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("kategori jdbc ile eklendi: " + category.getName());
	}

}
