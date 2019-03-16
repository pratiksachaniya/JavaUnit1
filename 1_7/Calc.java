/*Create a complex number class. The class should have a constructor and
methods to add, subtract and multiply two complex numbers and to return the
real and imaginary parts.*/
class Complex
{
	static double ans;
	static double add(double a,double b)
	{
		ans = a + b;
		return ans;
	}
	static double subtract(double a,double b)
	{
		ans = a-b;
		return  ans;
	}
	static double multiply(double a,double b)
	{
		ans = a*b;
		return ans;
	}
	Complex()
	{
		ans = 0;
	}	
}
class Calc
{
	public static void main(String[] ar)
	{
		Complex cmplx = new Complex();
		System.out.println("Add Is " + cmplx.add(10,20));
		System.out.println("Subtract Is " + cmplx.subtract(20,10));
		System.out.println("multiply Is " + cmplx.multiply(20,10));
	}
	
}