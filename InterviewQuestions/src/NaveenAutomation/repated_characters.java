package NaveenAutomation;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class repated_characters {

	public static void main(String[] args) {


		String str = " My j name is suraj";
		getCharOccurence(str, 'j');
		getRepeatedChar(str,'j');

	}
	
	
	public static void getRepeatedChar(String str , char val) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==val) {
				count++;
				
			}
		}
		System.out.println(val+" repeated char = "+count);
	}
		
		public static void getCharOccurence(String str,char val) {
			int count = 0;

			for (char ch : str.toCharArray()) {
				if (ch == val) {
					count++;
				}
			}
			
			System.out.println( val+" repeated number of times = " + count);
			
		}
	}

