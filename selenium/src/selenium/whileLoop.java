package selenium;

public class whileLoop {

	public static void main(String[] args)
	{
		int i=1;
		while (i<=100) 
		{
			System.out.println(i);
			if (i==70)
			{
				break;
			}
			i++;
		}

	}

}
