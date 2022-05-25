package String;

import java.util.HashMap;

public class Secondmost {
	
	public static void main(String arg[]) {
	String 	arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
	
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			int x=map.get(arr[i]);
			x++;
			map.put(arr[i], x);
			
		}
		else {
			map.put(arr[i], 1);
		}
	}
	int first=-1;
	int second=-1;
	String ans="";
	for(String key: map.keySet()) {
		 int i=map.get(key);
		 if(i>first) {
			 second=first;
			 first=i;
		 }
		 else if(i>second ) {
			 second=i;
			 ans=key;
			 
		 }
	}
	System.out.print(ans  +","+second);
	}

}
