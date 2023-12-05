package Faqprograms;

import java.util.Scanner;

public class Countnoofwords {

	public static void main(String[] args) {
        
		
		
		//Approach1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the string: ");
		String st=sc.nextLine();

		int count=1;

		for(int i=0;i<st.length()-1;i++) 
		{

			if( (st.charAt(i)==' ' ) && (st.charAt(i+1)!=' '));
			{
				count++;
			}


		}
		System.out.println("number  of words in a string is: "+count);


		//Approach2

		String s="this is a program jag de edjdj jdbjsb ";

		System.out.println("the given string is: "+s);


		String[] words=s.split("\s+");

		int totalwords=words.length;

		System.out.println("no.of words in the given string is:" +totalwords);
	}

}
