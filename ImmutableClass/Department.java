package ImmutableClass;

public class Department {
	private String dptname;

	public String getDptname() {
		return dptname;
	}

	public void setDptname(String dptname) {
		this.dptname = dptname;
	}

	@Override
	public String toString() {
		return "Department [dptname=" + dptname + "]";
	}
}
