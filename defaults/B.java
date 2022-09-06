package defaults;

public interface B {
	default void methodcall() {
		System.out.println("inside the interfaceB");
	}

}
