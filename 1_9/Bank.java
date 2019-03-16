/*A bank gives 6.5% per annum interest on deposits made in that bank. Write a
program to calculate the total amount that a person will receive after the end of
5 years for a deposit of Rs.5000 for compound interest. Create necessary
methods and constructors too.*/
class Interest
{
	int amnt;
	void calc()
	{
		for(int i =1; i<=5; i++)
		amnt += (amnt*6.5)/100;
		System.out.println("Total Amount to receive: " + amnt);
	}
	Interest(int am)
	{
		amnt = am;		
	}
}

class Bank
{
	public static void main(String[] ar)
	{
		Interest I = new Interest(5000);
		I.calc();
	}
}