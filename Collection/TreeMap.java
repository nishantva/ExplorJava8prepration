package Collection;

import java.util.Map;

public class TreeMap {
	
	public static void main(String arg[]) {
		Map<String,String> map=(Map<String, String>) new TreeMap();
		
		map.put("p", "hgfj");

		map.put("b", "jdks");

		map.put("e", "hgdks");

		map.put("g", "dks");
		
		
		//tree map internally use compareTO to sort the elemnt// return -1 left side return 1 right side daal do
		System.out.print(map);
		//{1=dks, 2=hgfj, 3=hgdks, 4=jdks}
		
		
	}

}
