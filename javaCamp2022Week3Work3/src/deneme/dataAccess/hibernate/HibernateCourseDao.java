package deneme.dataAccess.hibernate;

import deneme.dataAccess.CourseDao;
import deneme.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs hibernate yöntem ile eklendi.:"+course.getName());
	}

}
