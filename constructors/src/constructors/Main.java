package constructors;


public class Main
{

	public static void main(String[] args)
	{

		Product product=new Product(1,"Laptop","Asus Laptop",5000,2,"kırmızı");

		
		Product product2=new Product();
		product2.setId(2);
		product2.setDescription("Lenovo Laptop");
		product2.setName("Laptop");
		product2.setPrice(6000);
		product2.setStockAmount(3);
		
 		ProductManager productManager=new ProductManager();
 		productManager.add(product);
 		System.out.println(product.getKod());

	}

}
