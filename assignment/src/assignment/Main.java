package assignment;

public class Main {

	public static void main(String[] args) {
		//Hello World
				System.out.println("Hello World");
				
				System.out.println("Merhaba Java");
				System.out.println("Merhaba Java2");
				
				
				
				//Değişkenler
				int ogrenciSayisi=10;
				String mesaj="Öğrenci sayısı : ";
				System.out.println("Öğrenci sayısı : "+ogrenciSayisi);
				System.out.println(mesaj+ogrenciSayisi);
				
				//Temel veri tipleri
				byte sayi=12;
			 
				int sayi1=12;
				double sayi2=12.5;
				String sehir="ANKARA";
				char karakter='A';
				
				boolean dogruMu=true;
				
				
				//if Blokları
				
				int intSayi=24;
				
				
				if(intSayi<20) {
					System.out.println("Sayi 20 den küçüktür");
				}else if(intSayi>0){
					System.out.println("Sayı 20 den büyüktür");
				}else {
					System.out.println("Sayı 20 ye eşittir");
				}
				
				
				//Hangisi En büyük sayi
				
				int intSayi1=20;
				int intSayi2=25;
				int intSayi3=2;
				int enBuyukSayi=intSayi1;
				
				if(enBuyukSayi<intSayi2) {
					enBuyukSayi=intSayi2;
				} 
				
				if(enBuyukSayi<intSayi3) {
					enBuyukSayi=intSayi3;
					
				}
				
				System.out.println("En büyük sayi = "+enBuyukSayi);
				
				//Switch case
				
				
				char grade='H';
				
				
				switch (grade) {
				case 'A':
					System.out.println("Mükemmel : Geçtiniz");
					break;
				case 'B':
					System.out.println("Çok güzel : Geçtiniz");
					break;
				case 'C':
					System.out.println("İyi : Geçtiniz");
					break;
				case 'D':
					System.out.println("Fena Değil : Geçtiniz");
					break;
				case 'F':
					System.out.println("Maalesef Kaldınız");
					break;
					default:
						System.out.println("Geçersiz not girdiniz");
				}
				
				//For döngüsü
				
				for(int i=1;i<=10;i++) {
					System.out.println(i);
				}
				System.out.println("For Döngü bitti");

				//While döngüsü
				int i=2;
				while(i<10){
					System.out.println(i);
					i+=2;
				}
				System.out.println("While Döngü bitti");
				
				
				//Do While
				
				int s=1;
				do {
					System.out.println(s);
					s+=2;
					
				}while(s<10);
				 
				System.out.println("Do While Döngü bitti");
				
				
				//Diziler
				
				
				String[] ogrenciler= new String[4];
				ogrenciler[0]="Engin";
				ogrenciler[1]="Derin";
				ogrenciler[2]="Salih";
				ogrenciler[3]="Ahmet";
				
				for(int j=0;j<ogrenciler.length;j++) {
					System.out.println(ogrenciler[j]);
				}
				
				for (String ogrenci : ogrenciler) {
					System.out.println("For each ile : "+ogrenci);
				}
				
				
				//Recap Demo
				
				
				double[] myList = {1.2,1.3,4.3,5.6};
				double total=0;
				double max=myList[0];
				for (double number : myList) {
					
					if(number>max) {
						max=number;
					}
					total+=number;
					System.out.println(number);
				}
				System.out.println("Max number = "+max);
				System.out.println("Toplam = "+total);
				
				
				
				//Çok boyutlu diziler
				String[][] sehirler=new String[3][3];
				
				sehirler[0][0]="İstanbul";
				sehirler[0][1]="Bursa";
				sehirler[0][2]="Bilecik";
				sehirler[1][0]="Ankara";
				sehirler[1][1]="Konya";
				sehirler[1][2]="Kayseri";
				sehirler[2][0]="Diyarbakır";
				sehirler[2][1]="Şanlıurfa";
				sehirler[2][2]="Gaziantep";
				
				for(int a=0;a<3;a++) {
					System.out.println("------------------------------");
					for(int j=0;j<3;j++) {
						System.out.println(sehirler[a][j]);
					}
				}
				
				
				//Stringlerle Çalışmak
				
				String mesajim="Bugün hava çok güzel.";
				System.out.println(mesajim);
				
				System.out.println("Eleman sayısı : "+mesajim.length());
				System.out.println("5.eleman : "+mesajim.charAt(4));
				
				System.out.println(mesajim.concat(" Yaşasın!"));
				
				System.out.println(mesajim.startsWith("B"));
				System.out.println(mesajim.endsWith("."));
				char[] karakterler=new char[5];
				mesajim.getChars(0, 5, karakterler, 0);
				System.out.println(karakterler);
				
				System.out.println(mesajim.indexOf("av"));
				System.out.println(mesajim.lastIndexOf("a"));
				
				String yeniMesaj=mesajim.replace(' ', '-');
				
				System.out.println(yeniMesaj);
				System.out.println(mesajim.substring(2));
				System.out.println(mesajim.substring(2, 5));
				
				for (String kelime :mesajim.split(" ")) {
					System.out.println(kelime);
					
				}
				
				
				System.out.println(mesajim.toLowerCase());
				System.out.println(mesajim.toUpperCase());
				System.out.println(mesajim.trim());

	}

}
