package StarPatterns;

public class Pyramid_Example_2 {

	public static void main(String[] args) {
		/*.pattern
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		*  
		*  
		 
		 */
		
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" +");
			}
			System.out.println();
		}
	}

}
