
/*Length of the longest substring without repeating characters
For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6
For “BBBB” the longest substring is “B”, with length 1*/

package String;

import java.util.HashSet;

public class test {
	
	public static void main(String arg[]) {
		
		String s="ABDEFGABEF";
		int n=s.length();
		int res=0;
		for(int i=0;i<n;i++) {
		boolean[] vist= new boolean[256];
		
		for(int j=i;j<n;j++) {
			
			if(vist[s.charAt(j)]==true) {
				break;
			}
			else {
				res=Math.max(res,j-i+1 );
				vist[s.charAt(j)] = true;
			}
		}
		vist[s.charAt(i)]=false;
		
	}
		System.out.print(res);
		
	}
	

}
