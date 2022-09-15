package mukemmelSayi;

public class Main
{

	public static void main(String[] args)
	{
		
		int number=1;
		boolean mukemmelSayiMi=false;
		int total=0;
		
		if(number<=1) {
			System.out.println("Lütfen geçerli bir sayı giriniz");
			return;
		}
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		
		if(total==number) {
			System.out.println(number+" sayısı mukemmel bir sayıdır");
		}else {
			System.out.println(number+" sayısı mukemmel bir sayı değildir");

		}
	}

}
