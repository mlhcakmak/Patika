import java.util.*;

public class desenRecur
{
    public static void main(String[] args)
    {
        int num;
        Scanner tara = new Scanner(System.in);
        System.out.print("Sayi girin:");
        num= tara.nextInt();
        if(num<1)
        {
            System.out.println("Desen olusturmak icin min. sayi 1'dir. Kod tekrar calisacak.");
            main(null);
        }
        else
        desen(num, num, true);
    }

    public static void desen(int a, int b, boolean check)
    {
        int stat;
        System.out.print(b+"  ");
        if(b<1)
            check=false;
        stat=check ? (b-5):(b+5);
        if(stat<=a)
            desen(a,stat,check);
    }
}