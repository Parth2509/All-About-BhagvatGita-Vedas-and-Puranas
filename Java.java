import java.util.*;

class Java
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number");
		int a=sc.nextInt();
		System.out.print("Enter power");
		int b=sc.nextInt();
		int c=0;

		for (int i=1; i<=b; i++)
		{
			for (int j=1; j<=a; j++)
			{
				c=c+a;
			}
		}
		System.out.println("Power is "+c);
	}
}