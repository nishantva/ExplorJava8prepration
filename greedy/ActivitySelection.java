package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

class Pair {
	 
    int start;
    int end;
 
    Pair(int start, int end)
    {
      this.start = start;;
      this.end = end;
    }
  }
 

public class ActivitySelection {

	
	static class Sortcc  implements Comparator<Pair>{

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO Auto-generated method stub
			
			if(o1.end>o1.end) {
				return 1;
			}
			else if(o1.end<o2.end) {
				return -1;
			}
			return 0;
		}
		 
		 
	 }
	
	public static void main(String arg[]) {
		int start[]  =  {1, 3, 0, 5, 8, 5};
	    int end[] =  {2, 4, 6, 7, 9, 9};
	     int n=start.length;
		
		ArrayList<Pair>  arr=new ArrayList<Pair>();
		Sortcc obj=new Sortcc();
		
		for(int i=0;i<n;i++) {
			arr.add(new Pair(start[i],end[i]) );
			
		}
		
		Collections.sort(arr,obj);
		int ans=1;
		int prev=arr.get(0).end;//take the end value
		//System.out.print(prev);
		
		for(int i=1;i<n;i++) {
			if(arr.get(i).start>prev) {
				ans++;
				
				prev=arr.get(i).end;
			}
		}
		
		
		System.out.println(ans);
		
	}

}
