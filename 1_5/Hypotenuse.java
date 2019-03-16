/*Write a program to calculate the hypotenuse of right angled triangle when other
sides of the triangle are given. (Hypotenuse = square root (x*x + Y *Y))*/
import java.lang.Math;
import java.util.Scanner;
class Hypotenuse
{
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter Y: ");
		int y = sc.nextInt();
		double Hy = Math.sqrt(x*x+y*y);
		System.out.println("Hypotenuse Is " + Hy);		
	}
}