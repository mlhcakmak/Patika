import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0;

        System.out.print("Kaç tane sayı giriceksiniz:");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++){
            System.out.print(i+".Sayıyı giriniz:");
            int sayı = input.nextInt();

            if (sayı > max){
                if (min == 0){
                    min = sayı;
                }
                max = sayı;
            }else if (sayı < min) {
                if (max == 0){
                    max = sayı;
                }
                min = sayı;
            }

            
        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);

    }
}