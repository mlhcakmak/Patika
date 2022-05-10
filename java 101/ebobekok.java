import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Küçük sayısını giriniz:");
        int n1 = input.nextInt();
        System.out.print("Büyük sayısını giriniz:");
        int n2 = input.nextInt();

        int i = 1, ebob = 1, ekok = 1 ,k = 1;
        i = n1;


        while (i >= 1){
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("ebob:"+ ebob);

        while (k <= (n1 * n2)){
            if (k % n1 == 0 && k % n2 == 0){
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("ekok:" +ekok);


        System.out.println("Formülize olmuş hali:"+ (n1 * n2) / ebob );

    }
}