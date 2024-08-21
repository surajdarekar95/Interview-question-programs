package SDET_pavan;

public class Reverse_String {

	public static void main(String[] args) {
		String str = "suraj";
		String str1 = "darekar";
		String rev1 = "";
		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		char a[] = str1.toCharArray();

		int len1 = a.length;

		for (int i = len1 - 1; i >= 0; i--) {
			rev1 = rev1 + str1.charAt(i);
		}
		System.out.println(rev1);

		StringBuffer sb = new StringBuffer(str1);

		System.out.println(sb.reverse());
	}

}
