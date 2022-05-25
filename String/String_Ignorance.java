package String;


/*Input : Geeks for geeks
Output : Geks fore*/

public class String_Ignorance {
	
	public static void main(String arg[]) {

        String str = "Geeks for geeks";
        
        int occ[] =new int [122];
        
        String s = str.toLowerCase();
        
        for(int i=0;i<str.length();i++) {
        	
        	
        	char temp= s.charAt(i);
        	
        	occ[temp]++;
        	// If count is odd then print the character
        	if(occ[temp]%2 !=0) {
        		System.out.print(str.charAt(i));
        	}
        }
	}

}
