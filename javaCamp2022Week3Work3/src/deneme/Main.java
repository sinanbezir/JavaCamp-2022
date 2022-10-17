package deneme;


import deneme.business.CategoryManager;
import deneme.business.CourseManager;
import deneme.business.InstructorManager;
import deneme.core.loging.DatabaseLogger;
import deneme.core.loging.FileLogger;
import deneme.core.loging.Logger;
import deneme.core.loging.MailLogger;
import deneme.dataAccess.hibernate.HibernateCategoryDao;
import deneme.dataAccess.hibernate.HibernateCourseDao;
import deneme.dataAccess.hibernate.HibernateIntructorDao;
import deneme.dataAccess.jdbc.JdbcCategoryDao;
import deneme.dataAccess.jdbc.JdbcCoursDao;
import deneme.entities.Category;
import deneme.entities.Course;
import deneme.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers= {new FileLogger(),new DatabaseLogger(),new MailLogger()};
		//Ders Ekleme
		Course course=new Course(1,"java","yazılım","yazılım dersi","sinan",15);		
		CourseManager courseManager=new CourseManager(new JdbcCoursDao(),loggers);
		courseManager.add(course);
		
		//kurs fiyatının sıfırdan küçük olma durumu
		
		//Course course1=new Course(2,"c#","yazılım","yazılım dersi","selim",-5);		
		//courseManager.add(course1);
		
		//kurs isminin tekrar etme durumu
		
		//Course course2=new Course(3,"java","yazılım","yazılım dersi","hakan",10);		
		//courseManager.add(course2);
		
		
		//Category Ekleme
		Category category=new Category(1,"Yazılım");
		CategoryManager categoryManager =new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category);
		
		//kategori isminin tekrar etme durumu
		
		//Category category1=new Category(2,"Yazılım");
		//categoryManager.add(category1);
		
		
		//Eğitmen Ekleme
		
		Instructor instructor=new Instructor(1,"Engin");
		InstructorManager instructorManager=new InstructorManager(new HibernateIntructorDao(),loggers);
		instructorManager.add(instructor);
		
		
		
		
	}

}
