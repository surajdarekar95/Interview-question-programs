package SDET_pavan;

public class Reverse_each_word {

	public static void main(String[] args) {

		String str = "welcome to java haaa";

		String[] words = str.split(" ");

		String reversed_Words = "";

		for (String w : words) {

			String reverseWord = "";

			for (int i = w.length()-1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}

			reversed_Words = reversed_Words + reverseWord+" ";
		}

		System.out.println(reversed_Words);
	}

}
