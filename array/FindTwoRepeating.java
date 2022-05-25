package array;

public class FindTwoRepeating {

	
	public static void main(String arg[]) {
		int arr[]= {2,2,1,4,3,1};
		
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor=xor^arr[i];
		}
		
		int rsdm= xor & -xor;// main concept right most sit bit mask (help to find the odd and even avlue by bit)
		int x=0;
		int y=0;
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i] & rsdm)==0) {
				x=x^arr[i];
			}
			else {
				y=y^arr[i];
			}
		}
		
		System.out.print(x +","+y);
	}
}
