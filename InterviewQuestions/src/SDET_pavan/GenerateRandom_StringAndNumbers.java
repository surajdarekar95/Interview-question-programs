package SDET_pavan;

import java.util.Random;

public class GenerateRandom_StringAndNumbers {

	public static void main(String[] args) {

		Random rand =new Random();
		int num =rand.nextInt(100);
		System.out.println(num);
		
		boolean status =rand.nextBoolean();
		System.out.println(status);
		
		double db =rand.nextDouble();
		System.out.println(db);
		
		System.out.println(Math.random());


	}

}
