package String;

public class Longest_Common_Prefix {
	
	public static void main(String arg[]) {
     String		strs[] = {"flower","flow","flight"};
     //op "fl"
     
     String prefix=strs[0];
     
     for(int i=0;i<strs.length;i++) {
    	 while(strs[i].indexOf(prefix)!=0) {// check the prefix is present in the begining after that decrese the prefix
    		 prefix=prefix.substring(0,prefix.length()-1);
    	 }
     }
     System.out.print(prefix);
     
	}

}


/*
 * flower-->prefix;
 *  [flow,flight]
 */