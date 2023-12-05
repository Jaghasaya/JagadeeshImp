package Faqprograms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num=10;
		
		var factorial=1;
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}

		System.out.println("Factorial  of a number is:" +factorial);
	}

}
