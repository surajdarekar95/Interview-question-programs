package SDET_pavan;

import java.util.Scanner;

public class Largest_Of_ThreeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your fisrt number");
		int number1 = sc.nextInt();
		System.out.println("Enter your second number");
		int number2 = sc.nextInt();
		System.out.println("Enter your third"
				+ " number");
		int number3 = sc.nextInt();

		if (number1 > number2 && number1 > number3) 
		{
			System.out.println("Number1 is largest");
			
		} else if (number2 > number1 && number2 > number3) 
		{
			System.out.println("Number2 is largest");
			
		} else 
		{
			System.out.println("number3 is largetst");
		}
	}

}
