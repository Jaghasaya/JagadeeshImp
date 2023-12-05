package Faqprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsinArray {

	public static void main(String[] args) {
		
		//int a[]= {20,30,40,10,50,70};
		
		
		//Approach1
		
		/*System.out.println("Before sorting elements are:" +Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sorting elements are:" +Arrays.toString(a));*/
		
		//Approach2
		
		/*System.out.println("Before sorting elements are:" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting elements are:" +Arrays.toString(a));*/
		
		// Reverse order
		
		Integer a[]= {20,30,40,10,50,70};
		
		System.out.println("Before sorting elements are:" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());  // here it is allowed only in integer type not premitive type.
		System.out.println("After sorting elements are:" +Arrays.toString(a));
		
		
	}

}
