package kodlamaioAssignment.dataAccess;

import kodlamaioAssignment.entitites.Instructor;

public interface InstructorDao
{
	void addInstructor(Instructor instructor);
	void deleteInstructor(Instructor instructor);
	void updateInstructor(Instructor instructor);
}
