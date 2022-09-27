package reCapDemo_Classes;

public class Main
{

	public static void main(String[] args)
	{
		DortIslem dortIslem=new DortIslem();
		int sonuc;
		try
		{
			sonuc=dortIslem.bol(10, 0);
			System.out.println(sonuc);
		} catch (Exception e)
		{
			System.out.println("Oops Hata! "+e.toString());
		} 

	}

}
