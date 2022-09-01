i9package matrix;

public class SprialMatrix {
	
	public static void main(String arg[]) {
		
		int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
		
		int r=4,c=4;
		
		int top=0,left=0;
		int bottom=r-1,right=c-1;
		
		while(top<=bottom  && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(arr[top][i]);
			}
			top++;
		}
		for(int i= top;i<=bottom;i++) {
			System.out.print(arr[i][right]);
		}
		right--;
		
		if(top<=bottom) {
		for(int i=right;i>=left;i--) {
			System.out.print(arr[bottom][i]);
		}
		}
		bottom--;
		
		if(left<=right) {
		for(int i=bottom;i>=top;i--) {
			System.out.print(arr[i][left]);
		}
		left++;
		}
	}

}
