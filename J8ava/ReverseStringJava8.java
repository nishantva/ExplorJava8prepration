import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseStringJava8 {
	
	public static void main(String arg[]) {
		
		String str="abcdef";
		List<String> ans=Arrays.asList(str.split(""));
		
	ans.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i));
		
	}

}
