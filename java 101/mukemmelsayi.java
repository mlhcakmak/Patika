import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }
        if (toplam == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}