package interfaces;

public class CustomerManager
{
	private ICustomerDal _customerDal;
	
	public CustomerManager(ICustomerDal customerDal){
		_customerDal=customerDal;
	}
	
	public void add() {
		
		_customerDal.add();
	}

}
