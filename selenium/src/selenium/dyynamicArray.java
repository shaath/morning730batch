package selenium;

public class dyynamicArray {

	public static void main(String[] args) 
	{
		int[] sal=new int[5];
		
		System.out.println(sal.length);
		
		//Write the values into array
		
		sal[2]=40000;
		sal[4]=50000;
		
		for (int i = 0; i < sal.length; i++) 
		{
			System.out.println(sal[i]);
			
		}
		

	}

}
