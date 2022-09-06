package greedy;


/*N = 6
start[] = {1,3,0,5,8,5}
end[] =  {2,4,6,7,9,9}
Output: 
4*/
public class Activity_Selection_Problem {
	
	public static void main(String arg[]) {
		
		int start[]={1,3,0,5,8,5};
		int end[]={1,3,0,5,8,5};
		int n=start.length;
		int i,j;
		i = 0;
		//int count=1;
	    System.out.print(i+" ");
	    for (j = 1; j < n; j++)
	    {
	         if (start[j] >= end[i])
	         {
	              System.out.print(j+" ");
	              i = j;
	          }
	     }
		
	}

}
