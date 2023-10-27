package StringTest;

import java.util.HashMap;

public class Removecommoncharactersconcatenate {
	
	public static void main(String arg[]) {
		String s1 = "aacdb";
		String		s2 = "gafd";
		   
        HashMap<Character,Integer>  map=new     HashMap<Character,Integer> ();
        String res = "";
    
        for(int i=0;i<s2.length();i++ ){
            map.put(s2.charAt(i),1);
        }
        
        for(int i=0;i<s1.length();i++){
            if(!map.containsKey(s1.charAt(i))){
                res +=s1.charAt(i); 
            }
            else{
                map.put(s1.charAt(i),2);
            }
        }
        
        for(int i=0;i<s2.length();i++){
            if(map.get(s2.charAt(i))==1){
                res +=s2.charAt(i);
            }
        }
        
        System.out.print(res);
	}

}
