package array;

public class Arranging_the_array {
	
	public static void main(String arg[]) {
		int arr[]={-3, 3, -2, 2};
		int n=arr.length;
		StringBuffer a=new StringBuffer();
		StringBuffer b=new StringBuffer();
		
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				a.append(arr[i]+" ");
			}
			else {
				b.append(arr[i]+" ");
			}
		}
		 System.out.print(a);
		    System.out.print(b);
		
	}

}
