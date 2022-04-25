import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String userName, password,  select;

        System.out.print("Kullanıcı Adıınz : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
            System.out.print("Şifrenizi Sıfırlamak için 1'e basınız.");
            select = input.nextLine();

            if (select.equals("1")) {
                System.out.print("Yeni Şifreniz : ");
                password = input.nextLine();
                if (password.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz");
                } else {
                    System.out.println("Şifreniz Oluşturuldu.");
                }
            }
        }



    }
}