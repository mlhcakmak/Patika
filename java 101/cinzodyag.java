import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner (System.in);
        System.out.print("Doğduğunuz Yılınızı Giriniz :");
        yil=input.nextInt();

        if(yil<0)
            System.out.print("Hatalı Giriş Yaptınız!");
        if(yil%12 == 0){
            System.out.println("Çin zodyağı burcunuz : Maymun");

        }else if(yil%12 == 1){
            System.out.print("Çin zodyağı burcunuz : Horoz ");

        }else if(yil%12 ==2){
            System.out.print("Çin zodyağı burcunuz : Köpek ");
        }else if(yil%12 ==3){
            System.out.print("Çin zodyağı burcunuz : Domuz ");
        }else if(yil%12 ==4){
            System.out.print("Çin zodyağı burcunuz : Fare ");
        }else if(yil%12 ==5){
            System.out.print("Çin zodyağı burcunuz : Öküz ");
        }else if(yil%12 ==6){
            System.out.print("Çin zodyağı burcunuz : Kaplan ");
        }else if(yil%12 ==7){
            System.out.print("Çin zodyağı burcunuz : Tavşan ");
        }else if(yil%12 ==8){
            System.out.print("Çin zodyağı burcunuz : Ejderha ");
        }else if(yil%12 ==9){
            System.out.print("Çin zodyağı burcunuz : Yılan ");
        }else if(yil%12 ==10){
            System.out.print("Çin zodyağı burcunuz : At ");
        }else if(yil%12 ==11){
            System.out.print("Çin zodyağı burcunuz : Koyun ");
        }
    }
}