package array;

public class Element_with_Left_Smaller_Right_Greater {
	public static void main(String arg[]) {
		
		
		int arr[]= {4, 2, 5, 7};
		int n=arr.length;
		int max[]= new int[n];
		int min[]= new int[n];
		int result= -1;
		int big=arr[0];
		int small=arr[n-1];
		
		
		for(int i=0;i<n;i++) {
			
			if(big<=arr[i]) {
				big=arr[i];
				max[i]=big;
			}
			
		}
		
		for(int i=n-1;i>=0;i--) {
			
			if(arr[i]<small) {
				small=arr[i];
				min[i]=small;
			}
		}
		for(int i=0;i<n;i++) {
			if( i!=0 && i!=n-1) {
				if(min[i]==max[i]) {
					result=max[i];
					
					break;
				}
			}
		}
		
		System.out.print(result);
	}

}
