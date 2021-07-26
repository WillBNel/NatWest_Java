package classes;

public class IntegerClass {
	Integer i;

	public IntegerClass(Integer i) {
		this.i = i;
	}

	public void print() {
		System.out.println(i);
	}

	public void getType() {
		System.out.println(i.getClass().getName());
	}
}