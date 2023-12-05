package Faqprograms;

import java.util.Scanner;

public class CountofUpperLowerandspecial {
	
	public static void main(String[] args) {
		
		
		//String s="#GeeKs01fOr@gEEks07";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the string:" );
		String st=sc.nextLine();
		
		int upper=0 , lower=0, special=0, number=0;
		
		for(int i=0; i<st.length();i++) {
			
			char ch=st.charAt(i);
			if(ch>= 'A' && ch<= 'Z')
			upper++;
			else if(ch>= 'a' && ch<='z')
			lower++;
			else if(ch>= '0' && ch<= '9')
				number++;
			else
				special++;
			
			}
		System.out.println("upper case letters: "+upper );
		System.out.println("lower case letters: "+lower );
		System.out.println("Numbers: "+number );
		System.out.println("special case letters: "+special );
	}

}
