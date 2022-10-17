package deneme.dataAccess.hibernate;

import deneme.dataAccess.InstructorDao;
import deneme.entities.Instructor;

public class HibernateIntructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("instructor hibernate ile eklendi: " + instructor.getName());
	}
}
