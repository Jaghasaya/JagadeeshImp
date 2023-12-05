package Faqprograms;

public class EvenOddnumbersfromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		System.out.println("Even numbers are................");
		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//				System.out.println(a[i]);
//		}
		
		//using enhanced for loop
		
	    for(int value:a)
		{
			if(value%2==0);
			    System.out.println(value);
		}
 		
		System.out.println("Odd numbers are................");
		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2!=0)
//				System.out.println(a[i]);
//		}
		
		for(int value:a)
		{
			if(value%2!=0);
			    System.out.println(value);
		}
		

	}

}
