package selenium;

public class twoDim {

	public static void main(String[] args)
	{
		int[][] s=new int[2][3];
		
		//finding the length of the rows
		
		System.out.println(s.length);
		
		//finding the columns length
		
		System.out.println(s[0].length);
		
		
		//writing the data into an array
		
		s[0][2]=50000;
		s[1][1]=60000;
		
		//reading the values from an array
		
		for (int i = 0; i < s.length; i++)
		{
		
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.print(s[i][j]+"--");
			}
			System.out.println("");
		}

	}

}
