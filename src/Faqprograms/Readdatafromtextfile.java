package Faqprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readdatafromtextfile {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("./sample.txt");
		if(!f.exists())
			f.createNewFile();
		//Approach1 using fileinput stream
		/*
		 * FileInputStream fis=new FileInputStream(f); 
		 * int code;
		 * 
		 * while((code=fis.read())!=-1) { 
		 * System.out.print((char)code); 
		 * } 
		 * fis.close();
		 */
		
		// Approach 2 using scanner class
		
		Scanner sc= new Scanner(f);
		
		String text="";
		while(sc.hasNextLine()) {
			text=text+sc.nextLine() + "\n"; // here \n is refere write a text in next line
			
		}
		System.out.println(text);
		sc.close();
	
		
		
	}

}