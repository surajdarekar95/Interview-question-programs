package SDET_pavan;

public class Factorial_Number {

	public static void main(String[] args) {

		int num = 5;

		long fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
