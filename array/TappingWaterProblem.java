
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  for (int i=0;i<t;i++){
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      int left[]=new int[n];
	      int right[]=new int[n];
	      
	      for(int j=0;j<n;j++){
	          arr[j]=sc.nextInt();
	      }

      ----
	      left[0]=arr[0];
	      right[n-1]=arr[n-1];
	      for(int j=1;j<n;j++){
	          if(arr[j]>left[j-1]){
	              left[j]=arr[j];
	          }
	          else{
	              left[j]=left[j-1];
	          }
	       
	      }
	      for( int j=n-2;j>=0;j--){
	          if(arr[j]>right[j+1]){
	              right[j]=arr[j];
	          }
	          else{
	              right[j]=right[j+1];
	          }
	           
	      }
	      int water=0;
	      for(int j=0;j<n;j++){
	          int x=(Math.min(left[j],right[j]))-arr[j];
	          water=water+x;
	      }
	      System.out.println(water);
	      
	  }
	}
}
