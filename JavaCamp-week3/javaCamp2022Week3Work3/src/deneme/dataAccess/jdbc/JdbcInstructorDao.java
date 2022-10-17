package deneme.dataAccess.jdbc;

import deneme.dataAccess.InstructorDao;
import deneme.entities.Category;
import deneme.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("instructor jdbc ile eklendi: " + instructor.getName());
	}

}
