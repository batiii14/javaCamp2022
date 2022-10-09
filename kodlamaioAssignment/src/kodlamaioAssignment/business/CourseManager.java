package kodlamaioAssignment.business;

import java.util.List;

import kodlamaioAssignment.core.logging.Logger;
import kodlamaioAssignment.dataAccess.CourseDao;
import kodlamaioAssignment.entitites.Course;

public class CourseManager

{

	List<Course> _courses;
	CourseDao _courseDao;
	Logger[] _loggers;

	public CourseManager(List<Course> courses, CourseDao courseDao, Logger[] loggers)
	{
		_courses = courses;
		_courseDao = courseDao;
		_loggers = loggers;
	}
	
	public boolean isPriceValid(Course course) {
		if(course.getCoursePrice()<0) {
			return false;
		}else {
			return true;
		}
	}

	public void addCourse(Course course) throws Exception
	{

		if(isPriceValid(course)) {
			if (_courses.isEmpty())
			{
				_courses.add(course);
				_courseDao.addCourse(course);
				for (Logger logger : _loggers)
				{
					logger.log(course.getCourseName());
				}

			} 
			else
			{
				for (Course c : _courses)
				{
					if (c.getCourseName() == course.getCourseName())
					{
						throw new Exception(course.getCourseName() + " is already exist");
					}
				}
			}

			_courses.add(course);
			_courseDao.addCourse(course);
			for (Logger logger : _loggers)
			{
				logger.log(course.getCourseName());
			}
		}else {
			throw new Exception(course.getCourseName()+" price can not be less than 0");
		}
	}
}
