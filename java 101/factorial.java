import java.util.Scanner;

public class javaFactorial {

    public static void main(String[] args) {

        int num;
        int fact =1;
        int i =1;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number whose factorial is to be found: ");
        num = inp.nextInt();

        while (i<=num){
            fact = fact*i;
            i++;
            System.out.println("Factorial is: " + fact);
        }

    }