import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyArraySort {
	
	public static void main(String arg[]) {
		int arr[]={7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
		Map<Integer,Integer> map=new  LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int x=map.get(arr[i]);
				x++;
				map.put(arr[i],x);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		ArrayList<Integer> listsort=new ArrayList<Integer>();
		
		map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry->
		{for(int i=0;i<entry.getValue();i++)
			listsort.add(entry.getKey());
		});
		
		System.out.print(listsort);
		
		
	}

}
