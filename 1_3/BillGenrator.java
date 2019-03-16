/*A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers ,
3 to car lighting and 4 for air purifiers. All other items have code 5 or more.
While selling the goods, a sales tax of 2% to seat covers ,3% to steering wheel
covers, 4% to car lighting, 2.5% to air purifiers and 1.2% for all other items is
charged. A list containing the product code and price is given for making a bill.
Write a java program using switch statements to prepare a bill.*/
import java.util.Scanner;
class BillGenrator
{
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Seat Covers");
		System.out.println("2.Steering Wheel");
		System.out.println("3.Car Light");
		System.out.println("4.Air Purifiers");
		System.out.println("5.More...");
		System.out.print("Enter Your Choice: ");
		int ch = sc.nextInt();
		System.out.println("Enter Amount: ");
		double amount = sc.nextInt();
		double tax = 0;
		switch(ch)
		{
			case 1:
				tax = (amount*2)/100d;
				break;
			case 2:
				tax = (amount*3)/100d;
				break;
			case 3:
				tax = (amount*4)/100d;
				break;
			case 4:
				tax = (amount*2.5)/100d;
				break;
			case 5:
				tax = (amount*1.2)/100d;
				break;
			default:
				System.out.println("Invalid Input");
				return;			
		}
		
		System.out.println("Bill Amount   : " + amount);
		System.out.println("Tax               : " + tax);
		System.out.println("Total Amount: " + (amount-tax));		
		
	}
}