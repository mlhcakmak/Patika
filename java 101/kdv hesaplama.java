import java.util.Scanner;

public class KdvTutar {

	public static void main(String[] args) {
		
		 /* Ödev Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000
		 * TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı
		 * yazınız.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Hesaplanacak tutarı giriniz : ");
		int sayi = scan.nextInt();

		double kdv;

		if (sayi <= 1000 && sayi >= 0) {
			kdv = 0.18;
			System.out.println("KDV'siz fiyat : " + sayi);
			System.out.println("KDV oranı : " + kdv);
			System.out.println("KDV'li fiyat : " + (sayi + (sayi * kdv)));
			System.out.println("KDV tutarı : " + sayi * kdv);

		} else {
			kdv = 0.08;
			System.out.println("KDV'siz fiyat : " + sayi);
			System.out.println("KDV oranı : " + kdv);
			System.out.println("KDV'li fiyat : " + (sayi + (sayi * kdv)));
			System.out.println("KDV tutarı : " + sayi * kdv);

		}

	}

}