package Faqprograms;

public class reverseeachwordinstring {
	
	public static void main(String[] args) {
		
		// Approach 1
		
		/*
		 * String s="welcome to selenium"; // original string
		 * 
		 * String[] words=s.split(" "); // splitting multiple words
		 * 
		 * String reversestring="";
		 * 
		 * for(String w:words) {
		 * 
		 * String revsrseword="";
		 * 
		 * for(int i=w.length()-1;i>=0;i--) 
		 * 
		 * { revsrseword=revsrseword+w.charAt(i); }
		 * 
		 * reversestring=reversestring+revsrseword+ " "; }
		 * 
		 * System.out.println("reverse of a string is:" +reversestring);
		 */
		
		//Apprpoach 2
		
        String s="welcome to selenium"; // original string
		
		String[] words=s.split("\\s "); // splitting multiple words 
		
		String reverseword="";
		
		for(String w:words) {
			
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";
		}
		
		System.out.println(reverseword);
		
		
		
	}

}
