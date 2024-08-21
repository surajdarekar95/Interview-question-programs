package SDET_pavan;

public class Duplicate_Array_Element {

	public static void main(String[] args) {
		String []elements= {"suraj","suraj","rohan","rohan","shridhar"};
		DuplicateElement(elements);

	}

	public static void DuplicateElement(String[] elements) {

		for (int i = 0; i < elements.length; i++) 
		{
			for (int j = i + 1; j < elements.length; j++) 
			{

				if (elements[i] == elements[j]) 
				{
					System.out.println("fount duplicate element " + elements[i]);
				}
			}
		}
	}
}
