package SDET_pavan;

public class Sumof_ArrayElements {

	public static void main(String[] args) {
		int a[] = { 1, 5, 5, 3, 5, 9, 2 };
		int b[] = { 1, 2, 4, 5, 3, 6, 7,1,1};

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}

		System.out.println("Sum of array elements " + sum);

		for (int value : b) {
			sum1 = sum1 + value;
		}

		System.out.println("Sum of elements " + sum1);
	}

}
