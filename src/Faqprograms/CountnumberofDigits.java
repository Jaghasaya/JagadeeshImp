package Faqprograms;

public class CountnumberofDigits {

	public static void main(String[] args) {
		
		int num=12345678;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("no.of digits:" +count);
	}

}
