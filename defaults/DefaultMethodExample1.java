package defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample1 {
	public static void main(String arg[]) {
		
		List<String> stringList= Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");
		
		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorted list "+stringList);
		
		stringList.sort(Comparator.reverseOrder());
		
		System.out.print("Reverse list " +stringList);
	}

}
