package Static;


public class StaticClass {
	
	final public static String name = "Richard";
	public static Float age;
	
	public Integer num = 10;

	public class innerClass {
	
		
	}
	
	public static class staticNestedClass {
		String myNestedName = name;
		Float myNestedAge = age;
		
		void name() {
			System.out.println(name);
			msg("hello");
		}
	}
	

	
	final public void myMethod() {}

	public static void msg(String m) {
		System.out.println(m);
	}

}
