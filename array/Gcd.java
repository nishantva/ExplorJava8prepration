package array;

public class Gcd {
	
	
	public static void main(String arg[]) {
		System.out.print(Gcd(24,60));
	}
	
	public static int Gcd(int a,int b) {
		
		if(b==0) return a;
		return Gcd(b,a%b);
	}

}
