package selenium;

public class nestedIf 
{

	public static void main(String[] args) 
	{
		int a=300000;
		int b=40000;
		int c=5000;
		
		if (a > b & a>c) 
		{
			System.out.println("A is Greater");
			
		}
		else if (b > c &  b>a)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}

	}

}
