package kodlamaioAssignment.dataAccess.hibernate;

import kodlamaioAssignment.dataAccess.InstructorDao;
import kodlamaioAssignment.entitites.Instructor;

public class HibernateInstructorDao implements InstructorDao
{

	@Override
	public void addInstructor(Instructor instructor)
	{
		System.out.println("instructor with the following id: "+instructor.getId()+" has been added with Hibernate");		
	}

	@Override
	public void deleteInstructor(Instructor instructor)
	{
		System.out.println("instructor with the following id: "+instructor.getId()+" has been deleted with Hibernate");		
	}

	@Override
	public void updateInstructor(Instructor instructor)
	{
		System.out.println("instructor with the following id: "+instructor.getId()+" has been updated with Hibernate");
	}

}
