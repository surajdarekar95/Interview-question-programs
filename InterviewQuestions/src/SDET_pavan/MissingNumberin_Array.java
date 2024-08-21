package SDET_pavan;

public class MissingNumberin_Array {

	public static void main(String[] args) {

		int ms[] = { 1, 2, 3,4, 5,7,8,9,10};
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < ms.length; i++) 
		{
			sum1 = sum1 + ms[i];
		}

		System.out.println("Sum of array elements " + sum1);

		for (int i = 0; i <= 10; i++) 
		{
			sum2 = sum2 + i;
		}
		System.out.println("Sum of range " + sum2);

		System.out.println("missing number in of array  " + (sum2 - sum1));

	}

}
