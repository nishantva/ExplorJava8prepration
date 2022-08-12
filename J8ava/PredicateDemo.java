
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	/*
	 * @Override public boolean test(Integer t) {
	 * 
	 * if(t%2==0) { return true; } return false; }
	 */

	public static void main(String arg[]) {

		/*
		 * Predicate<Integer> predicate = new PredicateDemo();// without lambda
		 * expression//
		 */

		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} // direct by lambda
			else {
				return false;
			}
		};
		System.out.print(predicate.test(7));

	}

}
