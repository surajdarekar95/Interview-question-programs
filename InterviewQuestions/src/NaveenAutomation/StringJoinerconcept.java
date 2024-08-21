package NaveenAutomation;

import java.util.StringJoiner;

public class StringJoinerconcept {

	public static void main(String[] args) {

		StringJoinerconcept.StringJoiner_Method("suraj", "dattatray", "darekar");
		
		
	
	}
	
	public static void StringJoiner_Method(String str1,String Str2,String str3) {
		StringJoiner joiner = new StringJoiner(":","[","]");
		joiner.add(str1)
				.add(Str2)
				.add(str3);
		
		System.out.println(joiner.toString());
	}
	

}
