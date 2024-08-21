package NaveenAutomation;

public class Nested_if_else {

	public static void main(String[] args) {

		int age = 21;
		int weight = 54;

		if (age > 18) {

			if (weight > 55) 
			{
				System.out.println("eligible for blood donation");
			} else 
			{
				System.out.println("Oppssss not eligible for blood donation,kindly increase your weight");
			}
					} 
		else 
		{
			System.out.println("Age must be above 18");
		}

	}

}
