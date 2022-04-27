import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int hak = 3;
        int select;
        int balance = 1500, price;

        while (hak > 0) {
            System.out.print("Kullanıcı Adınız:");
            userName = input.nextLine();
            System.out.print("Şifreniz:");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev")){
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz.");

                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yapma");

                    System.out.print("Yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz !");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                hak--;
                System.out.println("Hatalı giriş yaptınız.Kullanıcı adı ve şifrenizi yeniden deneyiniz.");
                if (hak == 0){
                    System.out.println("Hesabınız Bloke Edilmiştir! Banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız:"+ hak);
                }


            }
        }


    }