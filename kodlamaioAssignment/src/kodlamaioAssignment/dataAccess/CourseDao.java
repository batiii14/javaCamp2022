package kodlamaioAssignment.dataAccess;

import kodlamaioAssignment.entitites.Course;

public interface CourseDao
{
	void addCourse(Course course);
	void deleteCourse(Course course);
	void updateCourse(Course course);
}
