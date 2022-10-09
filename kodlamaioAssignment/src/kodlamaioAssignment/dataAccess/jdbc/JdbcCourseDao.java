package kodlamaioAssignment.dataAccess.jdbc;

import kodlamaioAssignment.dataAccess.CourseDao;
import kodlamaioAssignment.entitites.Course;

public class JdbcCourseDao implements CourseDao
{

	@Override
	public void addCourse(Course course)
	{
		System.out.println(course.getCourseName()+" has been added with Jdbc");			
	}

	@Override
	public void deleteCourse(Course course)
	{
		System.out.println(course.getCourseName()+" has been deleted with Jdbc");					
	}

	@Override
	public void updateCourse(Course course)
	{
		System.out.println(course.getCourseName()+" has been updated with Jdbc");					
	}

}
