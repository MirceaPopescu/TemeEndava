
public class TestClass {

	public static void main(String[] args) {
		
		RandomStringGenerator gen = new RandomStringGenerator(5, "abcdef");
		System.out.println("Generating some random strings");
		System.out.println(gen.next());
		System.out.println(gen.next());
		System.out.println(gen.next());
		System.out.println(gen.next());
		
		
		PasswordMaker pm = new PasswordMaker("Mircea", "Popescu", 22);
		System.out.println(pm.getPassword());
	}

}
