package arkadasSayilar;

public class Main
{

	public static void main(String[] args)
	{
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1+=i;
			}
		}
		for(int i=1;i<sayi1;i++) {
			if(sayi2%i==0) {
				toplam2+=i;
			}
		}
		
		if(toplam2==sayi1 && toplam1==sayi2) {
			System.out.println(sayi1+" ve "+sayi2+" arkadaş sayılardır");
		}else {
			System.out.println(sayi1+" ve "+sayi2+" arkadaş sayılar değildir");
		}

	}

}