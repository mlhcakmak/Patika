import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.print("B sayısını giriniz : ");
        b = input.nextInt();

        double ckare;
        ckare = ((a * a)+(b * b));
        double c = Math.sqrt(ckare);
        System.out.println("C sayısı : " + c);

        double cevre,cevre1;
        cevre1 = ((a + b + c)/2);
        cevre = 2 * cevre1;
        System.out.println("Çevresi : "+ cevre);

        double alan;
        alan = cevre1 * (cevre1 - a ) * (cevre1 - b) * (cevre1 - c);
        System.out.print("Alanı : " + alan);

    }
}