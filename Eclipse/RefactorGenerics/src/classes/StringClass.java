package classes;

public class StringClass {
	String s;

	public StringClass(String s) {
		this.s = s;
	}

	public void print() {
		System.out.println(s);
	}
	
	public void getType() {
		System.out.println(s.getClass().getName());
	}
}