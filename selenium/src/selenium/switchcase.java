package selenium;

public class switchcase {

	public static void main(String[] args) 
	{
		String course="selenium";
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		default:
			System.out.println("Select a Proper Option");
			break;
		}

	}

}
