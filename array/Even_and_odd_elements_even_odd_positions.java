package array;

import java.util.ArrayList;

public class Even_and_odd_elements_even_odd_positions {
	
	public static void main(String arg[]) {
		int arr[] = {3, 6, 12, 1, 5, 8};
		
		int n=arr.length;
		  int oddInd = 1;
		    int evenInd = 0;
		   while(true) { 
		    
		    while(evenInd<n && arr[evenInd] %2 ==0) {
		    	evenInd +=2;
		    }
		    
		    while(oddInd<n && arr[oddInd] %2 ==1) {
		    	oddInd +=2;
		    }
		    
		    if(evenInd<n && oddInd< n) {
		    	  int temp = arr[evenInd];
	                arr[evenInd] = arr[oddInd];
	                arr[oddInd] = temp;
		    }
		    else {
		    	break;
		    }
		  
		    
		   }
		   
		   for (int i = 0; i < n; i++)
		        System.out.print(arr[i] + " ");
		
}
	}
