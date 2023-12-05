package Faqprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewExample {


	public static void main(String[] args) {

		String options="";
		String newvalue="";
		List<String> Details = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);

		if(Details.size()>0) {
			System.out.println("Do you want to see the details choose A");
			System.out.println("Do you want to enter the details choose B");
			options=sc.nextLine();
			System.out.println(options);
		}
		else {
			System.out.println("Enter the details: ");
			Scanner sc1=new Scanner(System.in);
			newvalue=sc1.nextLine();
		}
		sc.close();
	} 




}

