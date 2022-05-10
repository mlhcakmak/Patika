import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı, rakam, toplam = 0, i = 1;

        System.out.print("Bir Sayı Giriniz:");
        sayı = input.nextInt();

        while (sayı != 0) {
            rakam = sayı % 10;
            System.out.println(i+"ler basamağının rakamı:"+rakam);
            i *= 10;
            toplam += rakam;
            sayı /= 10;

        }
        System.out.print("Basamak Sayıları Toplamı:"+toplam);
    }
}