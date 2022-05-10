import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    int n;

        System.out.println("Son değeri giriniz : ");
        n = input.nextInt();


    if (n >= 1){
        System.out.println("4'ün " +n + "'den küçük kuvvetleri : ");

        for (int i = 1; i <= n; i *= 4) {

            System.out.print( i+ ",");
        }

        System.out.println();

        System.out.println("5'in " +n + "'den küçük kuvvetleri : ");
        for (int i = 1; i <= n; i *= 5) {

            System.out.print( i+ ",");

        }
    }else System.out.println("Tam sayı deger giriniz!");



    }
}