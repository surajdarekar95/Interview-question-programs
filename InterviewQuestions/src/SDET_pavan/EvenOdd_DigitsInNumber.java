package SDET_pavan;

public class EvenOdd_DigitsInNumber {

	public static void main(String[] args) {

		long number = 222222222211111l;

		long Even_Count = 0;
		long Odd_Count = 0;

		while (number > 0) {
			long rem = number % 10;

			if (rem % 2 == 0) {
				Even_Count++;
			} else {
				Odd_Count++;
			}

			number = number / 10;
		}
		
		System.out.println("Even count "+Even_Count);
		System.out.println("odd count "+Odd_Count);

	}

}
