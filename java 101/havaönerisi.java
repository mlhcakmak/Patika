import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değeri giriniz : ");
        int temp = input.nextInt();
        String str = "gidebilirsiniz";

        if( temp <= 5 ) System.out.println("Kayağa" + str);
        else if (temp <= 15) System.out.println("Sinemaya"+ str);
        else if (temp <= 25) System.out.println("Pikniğe"+ str);
        else  System.out.println("Yüzmeye"+ str);


    }
}