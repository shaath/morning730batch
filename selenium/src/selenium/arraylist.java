package selenium;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		
		//writing the data into arraylist
		
		x.add("Selenium");
		x.add("Urvin");
		x.add("Vasavi");
		x.add(3, "Sharath");
		//length of the array
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
			
		}

	}

}
