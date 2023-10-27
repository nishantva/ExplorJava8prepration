
public class MaorityElement {
	
	public static void main(String arg[]) {
		int arr[]= {2,3,4,4,4,4,2,3,4,4,4,4,1,1};
		int votes=0;
		int voter=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(votes==0) {
				voter=arr[i];
			}
			if(voter==arr[i]) {
				votes++;
			}
			else {
				votes--;
			}
		}
		
		int c=0;
		int n=arr.length/2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==voter) {
				c++;
			}
		}
		if(c>n) {
			System.out.print(voter);
		}
		else {
			System.out.print("-1");
		}
	}

}
