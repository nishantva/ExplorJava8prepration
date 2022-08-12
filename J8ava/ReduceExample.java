package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceExample {

	public static void main(String arg[]) {

		List<Integer> number = Arrays.asList(2, 4, 7, 4);

		List<String> stringarr = Arrays.asList("String", "hibernate", "raam", "nishnat");
		int myArray[] = { 1, 5, 8 };

		

		// sum of the number//
		Integer reduce = number.stream().reduce(0, (a, b) -> a + b);

		System.out.println(reduce);

		String maxlength = stringarr.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();

		List<Integer> remove3 = number.stream().filter(i -> i != 3).collect(Collectors.toList());
		remove3.forEach(i -> System.out.print(i));

		int sum = Arrays.stream(myArray).sum();
		System.out.println("the sum is" + "" + sum);
		
		String[] myStr = { "this", "is", "a", "sentence" };
		String strans = Arrays.stream(myStr).reduce("", (a, b) -> a + b);

		// System.out.println(maxlength);

		int reducesum = number.stream().reduce(0, (a, b) -> a + b);
		System.out.println("reducesum" + reducesum);

	}

}
