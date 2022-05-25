package array;

public class Duplicate {
	
	
	public static void main(Integer aarg[]) {
		
		int arr[]= {1,2,3,4,1,4,6,6};
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			if(arr[Math.abs(arr[i])] < 0) {
				System.out.println(Math.abs(arr[i]));
				
				
			}
			else 
			{
				arr[Math.abs(arr[i])]=  -1*arr[Math.abs(arr[i])];
			}
		//	System.out.print("hdjd");
			
		}
		
		
		
	}

}
