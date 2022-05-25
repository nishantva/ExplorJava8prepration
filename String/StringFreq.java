package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class StringFreq {

	public static void main(String arg[]) {

		String a = "aaccbbbbcd";
		char arr[] = a.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				int x = map.get(arr[i]);
				x++;

				map.put(arr[i], x);

			}

			else {

				map.put(arr[i], 1);
			}

		}

		

		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);

		}

		Collections.sort(list, new Comparator<Character>() {

			public int compare(Character a, Character b) {

				return map.get(b) - map.get(a);

			}

		});

		String result = "";
LinkedHashSet<Character> lhmp=new LinkedHashSet<Character>();
		for (char ch : list) {
		
				lhmp.add(ch) ;
			}
		
		
		System.out.print(lhmp);
		

	}

}
