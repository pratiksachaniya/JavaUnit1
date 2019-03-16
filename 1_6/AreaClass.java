/*Write a program to calculate the area of square and rectangle by overloading
the area method.*/
import java.util.Scanner;
class AreaClass
{
	static int Area(int a,int b)
	{
		return a*b;
	}
	
	static int Area(int a)
	{
		return a*a;
	}
	
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int l = sc.nextInt();
		
		System.out.print("Enter Width: ");
		int w = sc.nextInt();
		
		System.out.println("Area of square " + Area(l));
		System.out.println("Area of rectangle " + Area(l,w));		
	}	
}