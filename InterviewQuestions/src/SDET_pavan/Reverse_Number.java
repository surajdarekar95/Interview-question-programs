package SDET_pavan;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {

		// Approach 1
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");

		int number = sc.nextInt();
		int number1 = sc.nextInt();
		int number3 = sc.nextInt();

		int rev = 0;
		while (number != 0) {

			rev = rev * 10 + number % 10;
			number = number / 10;
		}

		System.out.println("Reversed number is: " + rev);

		// Approach 2

		StringBuffer sb = new StringBuffer(String.valueOf(number1));
		StringBuffer reversedNum = sb.reverse();
		System.out.println("New Reversed Number " + reversedNum);

		//Approach 3
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(number3);
		StringBuilder REVERSED = sbl.reverse();
		System.out.println("New Reversed Number " + REVERSED);

	}

}
