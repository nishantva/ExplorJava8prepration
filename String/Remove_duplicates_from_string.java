package String;

import java.util.HashSet;

public class Remove_duplicates_from_string {
	
	public static void main(String arg[]) {
		char str[]="niahnt".toCharArray();
		
		int n=str.length;
		
		
		HashSet<Character> set=new HashSet<Character>();
		
		for(int i=0;i<n;i++) {
			set.add(str[i]);
			
		}
		
		for(int i=0;i<set.size();i++) {
			System.out.print(str[i]);
		}
		
	}

}
