package kodlamaioAssignment.dataAccess.hibernate;

import kodlamaioAssignment.dataAccess.CourseDao;
import kodlamaioAssignment.entitites.Course;

public class HibernateCourseDao implements CourseDao
{

	@Override
	public void addCourse(Course course)
	{
		System.out.println(course.getCourseName()+" has been added with Hibernate");		
	}

	@Override
	public void deleteCourse(Course course)
	{
		System.out.println(course.getCourseName()+" has been deleted with Hibernate");		
	}

	@Override
	public void updateCourse(Course course)
	{
		System.out.println(course.getCourseName()+" has been updated with Hibernate");		
	}

}
