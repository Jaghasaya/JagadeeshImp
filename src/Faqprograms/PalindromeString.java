package Faqprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	
		// A palindrome String is a string that remains the same when its characters are reversed. like MADAM
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		
		String str=sc.next();
		String org_str=str;
		
		
		String rev="";
		
		 int len=str.length();
		 for(int i=len-1;i>=0;i--) {
			 rev=rev+str.charAt(i);
		 }
		 
		 if(org_str.equals(rev))
		 {
			 System.out.println(org_str+" is palindrome string");
		 }
		 else
		 {
			 System.out.println(org_str+" is not a palindrome string");
		 }

	}

}
