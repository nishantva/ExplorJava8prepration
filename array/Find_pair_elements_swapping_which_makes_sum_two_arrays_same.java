package array;

/*Input: A[] = {4, 1, 2, 1, 1, 2}, B[] = (3, 6, 3, 3) 
Output: {1, 3} 
Sum of elements in A[] = 11 
Sum of elements in B[] = 15 
To get same sum from both arrays, we 
can swap following values: 
1 from A[] and 3 from B[]*/
public class Find_pair_elements_swapping_which_makes_sum_two_arrays_same {
	
	public static void main(String arg[]) {
		 int A[] = { 4, 1, 2, 1, 1, 2 };
	        int n = A.length;
	        int B[] = { 3, 6, 3, 3 };
	        int m = B.length;
	        findSwapValues(A, n, B, m);
	        
		
	}
	  static int getSum(int X[], int n)
	    {
	        int sum = 0;
	        for (int i = 0; i < n; i++)
	            sum += X[i];
	        return sum;
	    }
	  
	  static void findSwapValues(int A[], int n, int B[], int m)
	    {
		  int sum1 = getSum(A, n);
	        int sum2 = getSum(B, m);
	        
	        int newsum1, newsum2, val1 = 0, val2 = 0;
	        
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
	        		newsum1=sum1-A[i]+B[j];
	        		newsum2=sum2-B[j]+A[i];
	        		if(newsum1==newsum2) {
	        			val1=A[i];
	        			val2=B[i];
	        		
	        		}
	        	}
	        }
	        
	        
	       
	        
	    }
	    }

