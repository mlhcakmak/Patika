import java.util.Scanner;


public class Taksimetre {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int acilis = 10;
        double kmBasi = 2.2;

        System.out.println("Mesafeyi giriniz (km): ");
        double mesafe = input.nextDouble();

        double kmTutari = kmBasi * mesafe;
        double toplam = (kmTutari + acilis > 20) ? kmTutari + acilis : 20;

        System.out.println("Ödemeniz gereken toplam tutar: " + toplam);
    }
}