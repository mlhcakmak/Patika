import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int number=0;
        int total=0;
        do {
            System.out.print("Sayı giriniz : ");
            number=scanner.nextInt();
            if(number%4==0) {
                total += number;
            }
        } while (number%2==0);
        System.out.println("Sayıların toplamı : "+total);
    }
}