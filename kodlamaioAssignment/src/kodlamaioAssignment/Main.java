package kodlamaioAssignment;

import java.util.ArrayList;
import java.util.List;

import kodlamaioAssignment.business.CategoryManager;
import kodlamaioAssignment.business.CourseManager;
import kodlamaioAssignment.core.logging.DatabaseLogger;
import kodlamaioAssignment.core.logging.FileLogger;
import kodlamaioAssignment.core.logging.Logger;
import kodlamaioAssignment.core.logging.MailLogger;
import kodlamaioAssignment.dataAccess.hibernate.HibernateCourseDao;
import kodlamaioAssignment.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaioAssignment.entitites.Category;
import kodlamaioAssignment.entitites.Course;

public class Main
{

	public static void main(String[] args) throws Exception
	{
		Category category=new Category(1, "Database");
		Category category2=new Category(2, "Web");
		Category category3=new Category(2, "Theoretical");
		
		Course course=new Course(1, "C++", 100);
		Course course2=new Course(1, "C", 100);
		Course course3=new Course(1, "Java", 100);
		
		

		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		List<Category> categories=new ArrayList<Category>();
		categories.add(category);
		categories.add(category2);
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(course);
		courses.add(course2);

		CategoryManager categoryManager=new CategoryManager(loggers,categories,new JdbcCategoryDao());
		categoryManager.addCategory(category3);
		
		CourseManager courseManager=new CourseManager(courses, new HibernateCourseDao(), loggers);
		courseManager.addCourse(course3);
	}

}
