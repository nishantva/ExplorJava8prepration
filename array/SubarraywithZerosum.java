package array;

import java.util.HashMap;

//good approch
public class SubarraywithZerosum {

	
	
	public static void main(String arg[]) {
		//int arr[]= {15 ,-2 ,2 ,-8 ,1 ,7 ,10 ,23};
		int arr[] ={ 15, -2, 2, -8, 1, 7, 10, 23 };
		int n=arr.length;
		int length=-1;
		HashMap<Integer,Integer> map=new  HashMap<Integer,Integer>();
		int count=0;
		
		
		int i=-1;
		int sum=0;
		map.put(sum,i);
		
		for( i=0;i<n;i++) {
			sum+=arr[i];
			
			if(map.containsKey(sum)) {
				count+=map.get(sum);
				
				map.put(sum, map.get(sum)+1);
			}
			else {
				map.put(sum, 1);
			}
		}
		
		System.out.println(count);
	}
}
