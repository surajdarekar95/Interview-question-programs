package NaveenAutomation;

public class VowelCount {

	
	public static boolean isVowel(char t) {
		return t=='a' || t=='e' || t=='i' || t=='o' || t=='u' || t=='A' || t=='E' || t=='I' || t=='O' || t=='U' ;
	}
	public static void main(String[] args) {

		String countVowel="aeiouAEIOU";
		int vCount=0;
		
		for(int i=0;i<countVowel.length();i++) {
			if(isVowel(countVowel.charAt(i))) {
				vCount++;
			}
		}
		System.out.println(vCount);
	}

}
