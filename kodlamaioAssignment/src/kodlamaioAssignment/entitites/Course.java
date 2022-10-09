package kodlamaioAssignment.entitites;

public class Course
{
	private int _id;
	private String _courseName;
	private double _coursePrice;

	public Course(int id, String courseName, double coursePrice)
	{

		_id = id;
		_courseName = courseName;
		_coursePrice = coursePrice;
	}

	public int getId()
	{
		return _id;
	}

	public void setId(int id)
	{
		_id = id;
	}

	public String getCourseName()
	{
		return _courseName;
	}

	public void setCourseName(String courseName)
	{
		_courseName = courseName;
	}

	public double getCoursePrice()
	{
		return _coursePrice;
	}

	public void setCoursePrice(double coursePrice)
	{
		_coursePrice = coursePrice;
	}

}
