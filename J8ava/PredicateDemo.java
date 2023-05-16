
import java.util.function.Predicate;

public  class PredicateDemo {//always prduce true and false

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

		Predicate<String> checklength = s->s.length() >=5;
		
		//2
		Predicate<String> checkeven=s->s.length() %2==0;
		
		System.out.println("length of string is grater than 5 "+checklength.test(" codeii"));
			
		System.out.println("after merge "+checklength.and(checkeven).test(" this is new string"));
		
		System.out.print("tet or"+checklength.or(checklength).test(" check"));
		
		
		//take only one
		System.out.print("negiate"+checklength.negate().test("codetest"));
	}

}
