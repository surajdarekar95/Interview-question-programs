package SDET_pavan;

public class Swapping_Numbers {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("Before Swapping "+a+" "+b);
		
		int t=a;
		a=b;
		b=t;
		
		System.out.println("Approach 1- After Swapping "+a+" "+b);
		
		System.out.println("Before Swapping "+a+" "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Approach 2- After Swapping "+a+" "+b);
		
		System.out.println("Before Swapping "+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Approach 3- After Swapping "+a+" "+b);

		

		
		

		
		
		
		
		
	}

}
