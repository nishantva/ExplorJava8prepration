// immutable class with mutable field

final class Employee {
    private final int id;
    private final List<String> skills;

    public Employee(int id, List<String> skills) {
        this.id = id;
        this.skills = new ArrayList<>(skills);   // this is called defence copy
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }
}
