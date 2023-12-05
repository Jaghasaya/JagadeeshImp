package Faqprograms;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		//File f= new File("C:\\resume.txt"); 
		File f= new File("C:\\Users\\Jagadeesh\\eclipse-workspace\\JagadeeshImp");
		System.out.println(Arrays.toString(f.listFiles()));
		
		//System.out.println(f.delete());
		
		//System.out.println(f.exists());
		
		//System.out.println(f.createNewFile()); // creating a file

	}

}
