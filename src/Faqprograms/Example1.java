package Faqprograms;



public class Example1 {

	public static void main(String args[]) {


		String s="W@%6@YWGygU12572Nu@%28@YY716";

		int number=0, uppercase=0, lowercase=0, special=0;

		for(int i=0;i<s.length();i++){

			char ch=s.charAt(i);
			if(ch>= 'A' && ch<='Z')
				uppercase++;
			else if(ch>= 'a' && ch<='z')
				lowercase++;
			else if(ch>= '0' && ch<='9')
				number++;
			else
				special++;
		}

		System.out.println("count of uppercase letters:" +uppercase);
		System.out.println("count of lowercase letters:" +lowercase);
		System.out.println("count of number letters:" +number);
		System.out.println("count of special letters:" +special);



	}

}


