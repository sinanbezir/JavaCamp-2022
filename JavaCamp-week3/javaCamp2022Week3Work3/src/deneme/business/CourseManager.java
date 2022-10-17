package deneme.business;

import java.util.ArrayList;
import java.util.List;

import deneme.core.loging.Logger;
import deneme.dataAccess.CourseDao;
import deneme.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<String> courseNames = new ArrayList<String>();

	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		for (String courseName : courseNames) {
			if (courseName == course.getName()) {
				throw new Exception("Bu kurs zaten kayıtlı!!!");
			}
		}
		if (course.getPrice() < 0) {
			System.out.println("kurs fiyatı:" + course.getPrice());
			throw new Exception("Kursun fiyatı 0dan küçük olamaz.");
		}
		
		System.out.println("Courses: ");
		courseNames.add(course.getName());
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		System.out.println();

	}
}
