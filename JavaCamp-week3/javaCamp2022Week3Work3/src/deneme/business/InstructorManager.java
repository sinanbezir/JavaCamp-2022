package deneme.business;

import deneme.core.loging.Logger;
import deneme.dataAccess.InstructorDao;
import deneme.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		System.out.println("Instructors: ");
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
		System.out.println();

	}

}
