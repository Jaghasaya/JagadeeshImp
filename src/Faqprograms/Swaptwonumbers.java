package Faqprograms;

public class Swaptwonumbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are: "+a+" "+b);
		
		// logic 1 using third variable
		
		/*int t=a;
		a=b;
		b=t;*/
		
		// Logic 2 --> using + & -  without using third variable
		
		/*a=a+b; // 10+20=30
		b=a-b;  // 30-20=10
		a=a-b;  // 30-10=20*/
		
		// Logic 3 --> use * and / (without using third variable)
		// here a & b values should not be zero
		
		
		/*a=a*b; // 10*20=200
		b=a/b; // 200/20=10
		a=a/b; // 200/10=20*/
		
	
		//Logic 4 --> Using bitwise XoR(^)
		
		/*a=a^b;  //10^20=30
		b=a^b;   //30^20=10
		a=a^b;    //30^10=20*/
		
		// Logic 5 -->Using  single statement
		// a=10 b=20
		
		b=a+b-(a=b);         
		
		System.out.println("After swapping values are: "+a+"  "+b);

	}

}
