package Faqprograms;


/* Natural number > 1
 Which has only 2 factors 1 and itself

 19 => 1 and 19 => prime number
 28 => 1,7,4,28,14 => not a prime number
 */


public class primeornot {

	public static void main(String[] args) {

		int num=12;

		int count=0;

		if(num>1) 
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println(" prime number");
			}
			else {
				System.out.println(" not a prime number");
			}

		}
		else {
			System.out.println(" not a prime number");
		}



	}

}
