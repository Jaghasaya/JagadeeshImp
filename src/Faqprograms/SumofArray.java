package Faqprograms;

public class SumofArray {

	public static void main(String[] args) {

 
		int a[]= {3,5,9,3,6};
		
		int sum=0;
		
	 /*	for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		
		// Enhanced for loop
		
		for(int value:a)
		{
		   sum=sum+value;
		}
		
		
		System.out.println("sum of array elements is:" +sum);
		

	}

}
