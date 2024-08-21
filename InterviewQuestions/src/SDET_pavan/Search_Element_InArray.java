package SDET_pavan;

public class Search_Element_InArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 60 };

		int Seach_element = 60;

		boolean status = false;

		for (int i = 0; i < a.length; i++) {
			if (Seach_element == a[i]) {
				System.out.println("Elements found at " + i);
				status = true;
				break;
			}
		}

		if (status == false) {
			System.out.println("element not fount");
		}

	}

}
