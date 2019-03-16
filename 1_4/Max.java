/*Write a java program to scan 3 integer values from the command line argument
and display the maximum number using conditional operator.*/
class Max
{
	public static void main(String[] ar)
	{
		int n1 = Integer.parseInt(ar[0]);
		int n2 = Integer.parseInt(ar[1]);
		int n3 = Integer.parseInt(ar[2]);
		
		int max = n1>n2?n1>n3?n1:n3:n2>n3?n2:n3;
		System.out.println("Max Is " + max);
	}
}