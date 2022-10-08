package youtubeEgitim;

public class Main
{

	public static void main(String[] args)
	{
		/*
		 * int sayi1 = 10; int sayi2 = 20; sayi1 = sayi2;
		 * 
		 * sayi2 = 100;
		 * 
		 * System.out.println(sayi1);
		 * 
		 * int[] sayilarArray1 = { 1, 2, 3 }; int[] sayilarArray2 = { 10, 20, 30 };
		 * sayilarArray1 = sayilarArray2;
		 * 
		 * sayilarArray2[0] = 1000; System.out.println(sayilarArray1[0]);
		 * 
		 * 
		 * 
		 * Customer customer=new Customer(); customer.setId(1);
		 * customer.setCity("Ankara");
		 * 
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save();
		 * 
		 * Company company = new Company(); company.taxNumber="100000";
		 * company.companyName="Arçelik"; company.id=100;
		 * 
		 * CustomerManager customerManager2=new CustomerManager(new Person());
		 * 
		 * 
		 * Person person= new Person(); person.setFirstName("A");
		 * person.setNationalId("23456");
		 * 
		 * Customer c1=new Customer(); Customer c2=new Person(); Customer c3=new
		 * Company();
		 */

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();

	}

}
