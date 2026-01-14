package Exception;


public class TestCustomException {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}

