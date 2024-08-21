package NaveenAutomation;

public class StringLength {

	// How to find length without using length method

	public static void main(String[] args) {

		String str = "Surajdattatraydarekar";
		String str1 = "ROHANdattatraydarekar";

		System.out.println(str1.toCharArray().length);

		System.out.println(str1.lastIndexOf(""));

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}

		System.out.println(count);
		System.out.println(Getlength(str));
		System.out.println(GetStringLength("suraj LTIMindtree"));
		Strin_Split("Suraj:infoysis:pune");
		

	}

	public static int Getlength(String str) {
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}

	}

	public static int GetStringLength(String str) {

		String NewString[] = str.split(":");
		int count = 0;
		for (String st : NewString) {
			count += st.toCharArray().length;
		}
		return count;

	}
	
	public static void Strin_Split(String str) {

		String NewString[] = str.split(":");
		for(String w:NewString){  
			System.out.println(w);  
			} 

	}
	

}
