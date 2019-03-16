/*A shop during festival season offers a discount 10% for purchase made up to
Rs.1,000, 12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for
purchase value of Rs.1,500 or more. Write a program to implement the above scheme for a
given sales and print out the sales and print out the sales value, discount and net amount
payable by a customer. Create necessary methods and constructors.*/
import java.util.Scanner;
class Offer
{
	int amnt,dis;
	void genBill()
	{
		if(amnt == 1000)
		dis = (amnt*10)/100;
		else if(amnt > 1000 && amnt < 1500)
		dis = (amnt*12)/100;
		else if(amnt >= 1500)
		dis = (amnt*15)/100;
		else
		dis = 0;
		System.out.println("Sales Value: " + amnt);
		System.out.println("Discount: " + dis);
		System.out.println("Net Amount: " + (amnt-dis));
	}
	Offer(int amount)
	{
		amnt = amount;
	}
}

class Discount
{
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amnt = sc.nextInt();
		Offer of = new Offer(amnt);
		of.genBill();
	}
}
