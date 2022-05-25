package array;

public class PrintTheMaxWindow {

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int n = arr.length;
		int K = 3;

		for (int i = 0; i <= n-K; i++) {
			
			int max=arr[i];
			for(int j=1;j<K;j++) {
				//System.out.println(i+" ,"+j+", ->"+arr[i+j]);
				if(arr[i+j]>max) {
					max=arr[i+j];
				}
				
			}
			System.out.print(" "+max);

		}
	}

}
