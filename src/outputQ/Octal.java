package output;

public class Octal {
	
	       public static void main(String[] args){
	               int[]  x = {120, 200, 016};
	               for(int i = 0; i < x.length; i++){
	                        System.out.print(x[i] + " ");//120 200 14
	                        //016 is an octal number, its equivalent decimal number is 14. Hence answer is B.
	               }                   
	       }
	}

