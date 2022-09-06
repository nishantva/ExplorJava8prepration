package defaults;

public interface A {

	default void methodcall() {
		System.out.println("inside the interfaceA");
	}
}
