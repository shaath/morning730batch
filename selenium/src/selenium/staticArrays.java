package selenium;

public class staticArrays 
{

	public static void main(String[] args) 
	{
		int[] sal={40000,50000,60000,70000,80000};
		
		//length of the array
		
		int len=sal.length;
		System.out.println(len);
		
		//reading values from an array
		
		for (int i = 0; i < sal.length; i++)
		{
			System.out.println(sal[i]);
		}
		
	}

}
