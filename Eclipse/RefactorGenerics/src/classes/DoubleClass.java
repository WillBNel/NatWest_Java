package classes;

public class DoubleClass {
	Double d;

	public DoubleClass(Double d) {
		this.d = d;
	}

	public void print() {
		System.out.println(d);
	}

	public void getType() {
		System.out.println(d.getClass().getName());
	}
}
