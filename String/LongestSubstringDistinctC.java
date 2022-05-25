package String;

import java.util.HashMap;

public class LongestSubstringDistinctC {
	public static void main(String arg[]) {
	
	String s="ABDEFGABEF";
	int count=0;
	int result=0;
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(int i=0;i<s.length();i++) {
		if(!map.containsKey(s.charAt(i))) {
		map.put(s.charAt(i),i);
		count++;
	}
		else {
			i=map.get(s.charAt(i));
			map.clear();
			count=0;
		}
	}
  result=Math.max(result,count);
  
  System.out.println(result);
}
}
