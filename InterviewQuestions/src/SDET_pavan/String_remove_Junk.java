package SDET_pavan;

public class String_remove_Junk {

	public static void main(String[] args) {

		String junk = " suraj darekar ASFGGF?><:[] 13466";

		
		String new_string = junk.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(new_string);
	}

}
