package classesWithAttributes111;

public class Main
{
	
	public static void main(String[] args)
	{
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		Product product1 = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		

		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		
		System.out.println(product1.getKod());

		
		

	}

}
