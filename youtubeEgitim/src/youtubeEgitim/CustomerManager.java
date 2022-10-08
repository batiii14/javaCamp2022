package youtubeEgitim;

public class CustomerManager
{
	ICreditManager _creditManager;
	private Customer _customer;

	CustomerManager(Customer customer,ICreditManager creditManager)
	{
		_customer = customer;
		_creditManager=creditManager;

	}

	void save()
	{
		System.out.println("Müşteri kaydedildi");
	}

	void delete()
	{
		System.out.println("Müşteri silindi");
	}

	void giveCredit()
	{
		_creditManager.calculate();
		System.out.println("Kredi verildi ");
	}

}
