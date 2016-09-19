package selenium;

public class reverseString {

	public static void main(String[] args) 
	{
		//QEdge----------> egdEQ
		
		String Original="vasavi";
		int len=Original.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
			char c=Original.charAt(i);
			System.out.print(c);
		}

	}

}
