package SDET_pavan;

public class Sum_Of_Digits {

	public static void main(String[] args) {

		int number = 6455;
		int sum = 0;

		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("Sum Of Digits in Number " + sum);
	}

}
