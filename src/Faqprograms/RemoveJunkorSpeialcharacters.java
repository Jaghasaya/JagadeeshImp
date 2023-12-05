package Faqprograms;

public class RemoveJunkorSpeialcharacters {

	public static void main(String[] args) {


		
		String s="@#@@ @@&@^ java @^@^ 2628728 GS^@@& selenium";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		// in our keyboard "^a-zA-Z0-9" other than these are special chars so,we have replace with those.
		
		// ^ --> charat symbol---> will do other than these symbols will replaced by replacxementarg.
		
		
	}

}
