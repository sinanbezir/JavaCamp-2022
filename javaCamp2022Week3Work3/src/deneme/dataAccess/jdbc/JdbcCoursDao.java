package deneme.dataAccess.jdbc;

import deneme.dataAccess.CourseDao;
import deneme.entities.Course;

public class JdbcCoursDao implements CourseDao{

	@Override
	public void add(Course course) {
		
			System.out.println("Kurs jdbc yöntem ile eklendi.: "+course.getName());
		
	}

	
}
