package String;

public class LongestPalindromicString {
	static int   resultStart;
	 static int   resultLenght;
	public static void  main(String arg []) {
	
	String s="ba";
	
	System.out.println(longestPalindrome(s));
}


	public static String longestPalindrome(String s) {
		
		if(s.length()<2) {
			
			return s;
		}
		
		for(int start =0;start<s.length();start++) {
			expandRange(s,start,start);
			expandRange(s,start,start+1);
			
		}
		
		
		
		return s.substring(resultStart, resultStart+resultLenght);
		
		
		
	}
  public static void expandRange(String s,int begain,int end) {
	  
	  
	  while(begain>=0 && end<s.length() && s.charAt(begain)==s.charAt(end)) {
		  begain--;
		  end++;
	  }
	  
	  if(resultLenght<end-begain-1) {
		  resultStart=begain+1;
		  resultLenght=end-begain-1;
	  }
  }
	
}
