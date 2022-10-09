package kodlamaioAssignment.dataAccess.jdbc;

import kodlamaioAssignment.dataAccess.InstructorDao;
import kodlamaioAssignment.entitites.Instructor;

public class JdbcInstructorDao implements InstructorDao
{

	@Override
	public void addInstructor(Instructor instructor)
	{
		System.out.println("instructor with the following id: "+instructor.getId()+" has been added with Jdbc");		
	}

	@Override
	public void deleteInstructor(Instructor instructor)
	{
		System.out.println("instructor with the following id: "+instructor.getId()+" has been deleted with Jdbc");		
	}

	@Override
	public void updateInstructor(Instructor instructor)
	{
		System.out.println("instructor with the following id: "+instructor.getId()+" has been updated with Jdbc");		
	}

}
