package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hasseteg 
{
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Manual");
		s.add("QTP");
		s.add("apple");
		s.add("QTP");
		s.add("Vasavi");
		s.add("Urvin");
		s.add("Sharath");
		
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String text=it.next();
			System.out.println(text);
		}
		
		
	}

}
