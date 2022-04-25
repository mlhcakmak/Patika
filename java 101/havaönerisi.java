import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz : ");
        sicaklik = input.nextInt();

        if(sicaklik<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if
            (sicaklik >= 5 && sicaklik <= 15)
            System.out.println("Sinemaya gidebilirsiniz.");
        else if (sicaklik>= 15 && sicaklik <= 25)
            System.out.println("Pikniğe gidebilirsiniz.");
        else if (sicaklik >25)
                    System.out.println("Yüzmeye gidebilirsiniz");


        }
    }