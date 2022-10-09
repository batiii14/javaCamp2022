package kodlamaioAssignment.business;

import kodlamaioAssignment.core.logging.Logger;
import kodlamaioAssignment.dataAccess.InstructorDao;
import kodlamaioAssignment.entitites.Instructor;

public class InstructorManager
{
	private InstructorDao _instructorDao;
	private Logger[] _loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers)
	{
		_instructorDao = instructorDao;
		_loggers = loggers;
	}

	public void addInstructor(Instructor instructor)
	{
		_instructorDao.addInstructor(instructor);
		
		for (Logger logger : _loggers)
		{	
			logger.log(instructor.getFirstName());
			
		}
	}

}
