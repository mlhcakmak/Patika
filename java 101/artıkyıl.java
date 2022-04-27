import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int year;

        System.out.println("Yıl Giriniz :");
        year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " artik yildir.");
        }else if (year % 4 == 0){
            System.out.println(year + " artik yildir.");
        }else {
            System.out.println(year + " artik yil degildir.");
        }




    }
}