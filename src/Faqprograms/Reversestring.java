package Faqprograms;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		
		String str=sc.next();
		
		String rev="";
		
		 int len=str.length();   // 4
		 for(int i=len-1;i>=0;i--) 
		 {
			 rev=rev+str.charAt(i);  //d
		 }
		 
		 System.out.println(rev);
	}
	
	
	
	

}
