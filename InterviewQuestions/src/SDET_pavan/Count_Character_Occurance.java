package SDET_pavan;

public class Count_Character_Occurance {

	public static void main(String[] args) {

		String str1 = "java selenium tetsing java";
		int one = str1.length();

		String str2 = str1.replace("e", "");
		int two = str2.length();
		int count = one - two;
		System.out.println(count);

	}

}
