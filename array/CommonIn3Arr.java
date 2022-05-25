package array;

import java.util.ArrayList;

public class CommonIn3Arr {
	
	public static void main(String arg[]) {
	    int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
 
      int n1=ar1.length;
      int n2=ar2.length;
      int n3=ar3.length;
      ArrayList<Integer> list=new ArrayList<Integer>();
      int i=0,j=0,k=0;
      while(i<n1 && j<n2 && k<n3) {
    	  
    	  if(ar1[i]== ar2[j] && ar2[j]==ar3[k]) {
    		  if(!list.contains(ar1[i])) {
    			  list.add(ar1[i]);  
    		  }
    		 
    		  i++;
    		  j++;
    		  k++;
    		
    		  
    	  }
    	  else if(ar1[i]<ar2[j]) {
    		  
    		  i++;
    	  }
    	  else if(ar2[j]<ar3[k]) {
    		  j++;
    	  }
    	  else {
    		  k++;
    	  }
      }
      
      list.stream().forEach(q->System.out.print(" "+q));
      
	}
	
	
	

}
