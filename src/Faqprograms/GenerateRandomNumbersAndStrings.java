package Faqprograms;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
	
		// Approach--1  Random
		
		Random ran=new Random();
		
		int R=ran.nextInt(10000);
	    System.out.println(R);
		
		
//		double N=ran.nextDouble();  // defautly it will give 0.1 to 1.0 
//		System.out.println(N);
		
		// Approach--2 Using Math class
		
		//System.out.println(Math.random());  // it will give only decimel values
		
	}

}
