package SDET_pavan;

public class Digits_In_Number {

	public static void main(String[] args) {

		int number = 1234567890;
		int count=0;
		

		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Total Number of Digits  "+count);
	
		
	}

}
