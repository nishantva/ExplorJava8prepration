package defaults;

public interface Interface1 {
	
	default void methodA() {
		System.out.println("inside the methodA"+Interface1.class);
	}

}
