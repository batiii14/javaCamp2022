package kodlamaioAssignment.entitites;

public class Instructor
{
	private int _id;
	private String _firstName;
	private String _lastName;

	public Instructor(int id, String firstName, String lastName)
	{

		_id = id;
		_firstName = firstName;
		_lastName = lastName;
	}

	public int getId()
	{
		return _id;
	}

	public void setId(int id)
	{
		_id = id;
	}

	public String getFirstName()
	{
		return _firstName;
	}

	public void setFirstName(String firstName)
	{
		_firstName = firstName;
	}

	public String getLastName()
	{
		return _lastName;
	}

	public void setLastName(String lastName)
	{
		_lastName = lastName;
	}

}
