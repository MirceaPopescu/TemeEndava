
public class PasswordMaker {

	static final int MAGIC_NUMBER = 7;
	static final String MAGIC_STRING = new RandomStringGenerator(20, "abcdefghijklmnopqrstuv1234567890").next();
	String firstName;
	String lastName;
	int age;

	PasswordMaker(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	String getPassword() {
		String Password = new String();

		Password += firstName.substring(firstName.length() - age % 3); // ultimele age % 3 litere din firstName
		Password += new RandomStringGenerator(MAGIC_NUMBER, new RandomStringGenerator(10, MAGIC_STRING).next()).next(); //sirul de lungime MAGIC_NUMBER
		Password += (age + lastName.length());
		return Password;
	}
}
