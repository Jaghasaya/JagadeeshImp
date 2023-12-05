package Faqprograms;

import java.util.Scanner;

public class Passfailexample {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int marks;
		System.out.println("Please enter student marks: ");
		marks=scanner.nextInt();
		if (marks<35) {
			System.out.println("Result : FAIL");
		}
		else {
			System.out.println("Result : PASS");
			if (marks>=35 && marks<=70) {
				System.out.println("Grade : THIRD CLASS");
			}else {
				if (marks>=71 && marks<=85) {
					System.out.println("Grade : SECOND CLASS");
				}
				else {
					System.out.println("Grade : FIRST CLASS");
				}
			}
		}
	
	}

}
