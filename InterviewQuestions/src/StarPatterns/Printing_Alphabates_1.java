package StarPatterns;

public class Printing_Alphabates_1 {

	public static void main(String[] args) {
		
		//A-Z : 65 to 90
		//a-z : 97 to 122
		
		/*
		 	A 
			B B 
			C C C 
			D D D D 
			E E E E E 
			F F F F F F  
		 */

		int alpha = 65;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha + " ");
			}
			alpha++;
			System.out.println();
		}
	}

}
