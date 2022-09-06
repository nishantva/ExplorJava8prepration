package Collection;

import java.util.HashMap;
// import java.

//Can a HashMap key be mutable?The answer is NO.

/*//Making keys in any hashing data structure will cause memory leak.If we make the keys mutable then the 
hashcode()of the key will no more be consistent over time which will cause lookup failure for that object from
the data structure*/

public class MutualKeyHashMap {

	public static void main(String arg[]) {
		HashMap<Employee, String> map = new HashMap<Employee, String>();

		Employee e1 = new Employee("ram", 1);
		map.put(e1, "day1");
		System.out.println(map.get(e1));
		e1.setName("rahul");
		System.out.println("before change -> " + map.get(e1));

	}

}
