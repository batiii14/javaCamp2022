package classesWithAttributes111;



public class ProductManager
{
	public void add(Product product)
	{
		System.out.println(product.getName()+" isimli ürün eklendi.");
	}
	
	public void add2(int id,String name,String description,int stockAmount,double price,String renk)
	{
		System.out.println("Ürün eklendi.");
	}
}