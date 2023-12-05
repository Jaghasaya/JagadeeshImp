package Faqprograms;

public class CountCharacterOccurance {

	public static void main(String[] args) {

        String s="java is a programming language and case sensitive";
        
        int total_count=s.length();
        
        int b=s.replace("a", "").length();
        
        int count=total_count-b;
        System.out.println("Number occurances of 'a' is:" +count);
        
        

	}

}
