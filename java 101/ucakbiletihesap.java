import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, type;
        double tutar;
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        type = input.nextInt();
        boolean isError = false;

        tutar = km * 0.10;

        if ((0 < age) && (0 < km) && ((type > 0) && (type < 3))) {
            if (age < 12) {
                tutar -= tutar * 50  / 100;
            } else if (age <= 24) {
                tutar  -= tutar * 10 / 100;
            } else if (age > 65) {
                tutar  -= tutar  * 30 / 100;
            }
            if (type == 2) {
                tutar = (tutar - (tutar  * 20  / 100)) * 2;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar = " + tutar + " TL");
        }






    }
}