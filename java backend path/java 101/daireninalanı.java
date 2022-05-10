import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r, a;
		double pi=3.14;
		System.out.print("Please enter the circle angle: ");
		a=sc.nextInt();
		System.out.print("Please enter the circle radius: ");
		r=sc.nextInt();
		//field cannot be minus!!
		r=(r<0) ? -r : r;
		//Angle is used as 360 mode!!
		a=(a>360) ? a % 360 : a;
		double area=(pi*(r*r))*a/360;
		double circum=2*pi*r*a/360;
		
		System.out.println("The circle area= " + area);
		System.out.println("The circle circumference= " + circum);
		
	
	}

}