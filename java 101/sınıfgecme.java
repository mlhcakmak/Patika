import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, toplam = 0, ekle=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat=input.nextInt();
        if (mat>=0 && mat<=100)
        {
            toplam+=mat;
            ekle++;
        }

        System.out.print("Fizik notunuz: ");
        fizik=input.nextInt();
        if (fizik>=0 && fizik<=100)
        {
            toplam+=fizik;
            ekle++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce=input.nextInt();
        if (turkce>=0 && turkce<=100)
        {
            toplam+=turkce;
            ekle++;
        }

        System.out.print("Kimya notunuz: ");
        kimya=input.nextInt();
        if (kimya>=0 && kimya<=100)
        {
            toplam+=kimya;
            ekle++;
        }

        System.out.print("Müzik notunuz: ");
        muzik=input.nextInt();
        if (muzik>=0 && muzik<=100)
        {
            toplam+=muzik;
            ekle++;
        }

        double average=toplam/ekle ;
        if (average<55)
        {
            System.out.println("Sınıfta kaldınız");
        }
        else
        {
            System.out.println("Tebrikler, sınıfı geçtiniz");
        }
        System.out.print("Ortalamanız: "+average);

    }
}