package NaveenAutomation;

public class Print1to100WithoutUsingloop {

	/* print 1 to 100 without using loop */
	// Both Functions are recursive

	public static void main(String[] args) {
		PrintNum(1);
		System.out.println();
		PrintNumber(1, 80);

	}

	public static void PrintNum(int num) {
		if (num <= 50) {
			System.out.print(" " + num);
			num++;
			PrintNum(num);
		}
	}

	public static void PrintNumber(int Start, int end) {
		if (Start <= end) {
			System.out.print(" " + Start);
			Start++;
			PrintNumber(Start, end);
		}
	}

}
