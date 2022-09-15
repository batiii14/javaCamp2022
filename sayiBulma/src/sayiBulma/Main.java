package sayiBulma;

public class Main
{

	public static void main(String[] args)
	{
		int[] sayilar=new int[] {1,2,5,7,9,0};
		
		int aranacak=3;
		boolean bulunduMu=false;
		
		for (int sayi : sayilar)
		{
			if(sayi==aranacak) {
				bulunduMu=true;
				break;
			}
		}
		
		if(bulunduMu) {
			System.out.println("Aranan sayı bulundu");
		}else {
			System.out.println("Aranan sayı burada yok");
		}
	}

}
