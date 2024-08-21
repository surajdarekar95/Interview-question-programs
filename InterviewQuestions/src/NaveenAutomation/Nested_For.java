package NaveenAutomation;

public class Nested_For {

	public static void main(String[] args) {

		// Print 11,12,13,21,22,23,31,32,33

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
