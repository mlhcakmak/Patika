import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month , day ;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay :");
        month = input.nextInt();
        if (month < 0 || month > 12){
            throw new RuntimeException("Girdiğiniz ay geçersiz!");
        }

        System.out.println("Doğduğunuz gün :");
        day = input.nextInt();
        if (day < 0 || day > 31 || (month == 2 && day > 28) ||( (month == 4 || month == 6  || month == 9 || month == 11) && day > 28)) {
            throw new RuntimeException("Girdiğiniz gün geçersiz!");
        }

        if ((month==1 && day<=20)||(month==12 && day>=21)) {
            System.out.println("Oğlak");
        }else if((month==1 && day>=21)||(month==2 && day<=19)) {
            System.out.println("Kova");
        }else if((month==2 && day>=20)||(month==3 && day<=20)) {
            System.out.println("Balık");
        }else if((month==3 && day>=21)||(month==4 && day<=20)) {
            System.out.println("Koç");
        }else if((month==4 && day>=21)||(month==5 && day<=20)) {
            System.out.println("Boğa");
        }else if((month==5 && day>=21)||(month==6 && day<=21)) {
            System.out.println("İkizler");
        }else if((month==6 && day>=22)||(month==7 && day<=22)) {
            System.out.println("Yengeç");
        }else if((month==7 && day>=23)||(month==8 && day<=23)) {
            System.out.println("Aslan");
        }else if((month==8 && day>=24)||(month==9 && day<=23)) {
            System.out.println("Başak");
        }else if((month==9 && day>=24)||(month==10 && day<=23)) {
            System.out.println("Terazi");
        }else if((month==10 && day>=24)||(month==11 && day<=22)) {
            System.out.println("Akrep");
        }else if((month==11 && day>=23)||(month==12 && day<=21)) {
            System.out.println("Yay");
        }
        /*
        // Exception handling kullandığım için Flag'e gerek kalmadı.
        boolean isError = false;
        if (isError){
            System.out.println("hatalı giriş");
        }
        ...
         */

    }
}