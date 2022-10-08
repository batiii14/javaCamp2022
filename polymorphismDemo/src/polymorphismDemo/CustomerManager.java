package polymorphismDemo;

public class CustomerManager
{
	private BaseLogger _logger;

	public CustomerManager(BaseLogger logger)
	{
		_logger=logger;
		
	}

	public void add()
	{
		System.out.println("Müşteri eklendi");
		_logger.log("Log mesajı");

	}

}
