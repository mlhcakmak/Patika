import java.util.Scanner;
public class usHesabiYapanProgram {

    static void pow(){
        Scanner input = new Scanner(System.in);
        int base, exponent, result = 1;
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        base = input.nextInt();
        System.out.print("Us degeerini giriniz: ");
        exponent = input.nextInt();
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " sayisinin " + exponent + ". kuvvetti: "   + result);
    }
    public static void main(String[] args) {
        pow();
    }
}