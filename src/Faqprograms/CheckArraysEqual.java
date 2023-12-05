package Faqprograms;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		
		int a1[]= {1,2,4,4,5,6};
		int a2[]= {1,2,4,5,6,7};
		
		boolean values=Arrays.equals(a1, a2);
		
		if(values=true)
		{
			System.out.println("the arrays are equal");
		}
		else
		{
			System.out.println("the arrays are not equal ");
		}
	}

}
