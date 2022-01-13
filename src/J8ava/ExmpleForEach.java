package J8ava;

import java.util.ArrayList;

public class ExmpleForEach {
	
public static void main(String arg[]) {
	
	
	ArrayList<String> arr =new ArrayList<String>();
	arr.add("ram");
	arr.add("sham");
	arr.add("mohit");
	arr.add("subham");
	
	arr.forEach (name->System.out.println(name));
		
	}

}
