package array;

public class ZigZag {
	public static void main(String arg[]) {
	int 	arr[] = {4, 3, 7, 8, 6, 2, 1};//output3 7 4 8 2 6 1
	int n=arr.length;
	int temp;
	for(int i=0;i<n-1;i++) {
		if(i%2==0 && arr[i]>arr[i+1]) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		else if(i%2==1 && arr[i+1]>arr[i]) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	for(int i=0;i<n;i++) {
		System.out.print(" "+arr[i]);
	}
	}

}
