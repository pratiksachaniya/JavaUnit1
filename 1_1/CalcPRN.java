/*Write a program to evaluate simple interest of a given principle, rate and time.*/
import java.util.Scanner;
class CalcPRN
{
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PRN:'");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		double sum = (p*r*n)/100d;
		System.out.println("Simple interest is " + sum);		
	}
}