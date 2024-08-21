package SDET_pavan;

import java.util.Scanner;

public class SearchElementIn_Array {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element want to search");
		int search_Element = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (search_Element == arr[i]) {
				System.out.println("element found at " + i);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}
	}

}
