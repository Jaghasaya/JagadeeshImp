package Faqprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);     // This will accept a value from the user at the run time
		System.out.println("Enter a number: ");
		
		int num=sc.nextInt(); // nextint int accept the value from the user and which is stored in num
		
        // Approach 1--> Using algorithmc
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10; // 0+1234%10=4    40+3=43   430+2=432   4320+1=4321
			num=num/10;        // 1234/10 =123	  123/10=12   12/10=1  1/10=0			
		}
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=sb.reverse();*/
		
	    // Using sting Builder
		
		/*StringBuilder sbl=new StringBuilder();
		StringBuilder rev=sbl.append(num);*/
		
		System.out.println("reverse number is:" +rev);
		
				
	}

}
