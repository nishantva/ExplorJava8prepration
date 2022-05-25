package array;

public class StockBuy {
	
	public static void main(String arg[]) {
		
		int arr[]=  {7,1,5,3,6,4};
		
		int n=arr.length;
		int maxprofit=0;
		int min=arr[0];
		
		for(int i=1;i<n;i++) {
			maxprofit=Math.max(arr[i]-min,maxprofit );
			min=Math.min(arr[i], min);
		}
		System.out.print(maxprofit);
		
	}

}
