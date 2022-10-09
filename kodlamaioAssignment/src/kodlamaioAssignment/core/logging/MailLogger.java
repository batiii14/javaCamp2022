package kodlamaioAssignment.core.logging;

public class MailLogger implements Logger
{

	@Override
	public void log(String message)
	{
		System.out.println("Logged to mail :"+message);
		
	} 

}
