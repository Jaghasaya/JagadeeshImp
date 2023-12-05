package Faqprograms;


import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employ details:");
		String a=sc.nextLine();

		if(a.equals("jagha") || a.equals("saya")) {
			if(a.equals("jagha")) {
				System.out.println("Do you want to see the details of jagha");
				Scanner sc1=new Scanner(System.in);
				String a1=sc1.nextLine();
				if(a1.equals("Yes"))
				{
					System.out.println("employ name=jagha");
					System.out.println("employ id=10143J01");
					System.out.println("employ salary=30000");
				}
			}
			else if(a.equals("saya"))
			{
				System.out.println("Do you want to see the details of saya");
				Scanner sc1=new Scanner(System.in);
				String a1=sc1.nextLine();
				if(a1.equals("Yes"))
				{
					System.out.println("employ name=saya");
					System.out.println("employ id=10143J02");
					System.out.println("employ salary=20000");
				}



				else {
					System.out.println("no command found");
				}

			}

		}

		else {
			System.out.println("no data found");   
		}
	}
	}


