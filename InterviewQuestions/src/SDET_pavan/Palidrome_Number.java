package SDET_pavan;

public class Palidrome_Number {

	public static void main(String[] args) {

		int num = 12345321;
		int org_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Origianl Number: " + org_num);
		System.out.println("reverse Number: " + rev);

		if (org_num == rev) {
			System.out.println("Palidrome Number");
		} else {
			System.out.println("Not a palidrome");
		}
	}

}
