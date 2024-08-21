package SDET_pavan;

import java.util.Arrays;

public class CheckTwoArray_equals {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5};

		// Approach 1
		/*
		  boolean status = Arrays.equals(a, b);
		  
		  if (status == true) 
		  { 
		  System.out.println("Equal Arrays"); 
		  } else 
		  {
		  System.out.println("Not Equal"); 
		  }
		 */

		boolean status = true;

		if (a.length == b.length) {
			for(int i=0;i<=a.length-1;i++) {
				if(a[i] != b[i]) {
					status =false;
				}
			}

		} else {
			System.out.println("Arrays are not euqals");
		}
		
		if(status == true) {
			System.out.println("Equal Arrays");
		}else {
			System.out.println("Not Equal Arrays");
		}
	}

}
