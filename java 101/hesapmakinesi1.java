import java.util.Scanner;


public class SwitchCaseHesapMakinasi {
    public static void main (String [] args){
       int n1,n2,select;
       Scanner input= new Scanner(System.in);

       System.out.print("1. Sayıyı giriniz :");
       n1=input.nextInt();

       System.out.print("2. sayıyı giriniz :");
       n2=input.nextInt();

       System.out.print("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma\n");
       System.out.println("Seçiminiz :");
       select=input.nextInt();

       switch (select){
           case 1:
               System.out.println("Sonuç :"+(n1+n2));
                   break;
           case 2:
                   System.out.println("Sonuç"+(n1-n2));
                   break;
           case 3:
             if (n1==0){
                 System.out.println("1. sayı sıfıra eşit olamaz");
             }
             else
              System.out.println("Sonuç : "+(n1/n2) );
                   break;
           case 4:
               System.out.println("Sonuç :"+ (n1*n2));
               break;
           default:
               System.out.println("Yanlış seçim yaptinız");
               break;



       }



    }
}