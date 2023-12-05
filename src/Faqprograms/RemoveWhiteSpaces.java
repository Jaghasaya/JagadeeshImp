package Faqprograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		 
		String st="welcome   to    java    and    selenium";
		
		String str=st.replaceAll("\\s", "");
		
		
		
        System.out.println("After removing the white spaces:" +str);
	}

}
