package methods;

public class Main
{

	public static void main(String[] args)
	{
		sayiBulmaca();

	}

	public static void sayiBulmaca()
	{
		int[] sayilar = new int[]
		{ 1, 2, 5, 7, 9, 0 };

		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar)
		{
			if (sayi == aranacak)
			{
				varMi = true;
				break;
			}
		}
		
		String mesaj="";
		if (varMi)
		{
			mesaj=aranacak+" Sayısı mevcuttur";
			mesajVer(mesaj);
		} else
		{
			mesajVer(aranacak+" Sayısı mevcut değildir");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
