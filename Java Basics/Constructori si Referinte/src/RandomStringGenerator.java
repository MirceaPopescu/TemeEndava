import java.util.Random;

public class RandomStringGenerator {
	int len;
	char[] alphabet;
	Random generator;

	RandomStringGenerator(int length, String alphabet) {
		this.len = length;
		this.alphabet = alphabet.toCharArray();
		generator = new Random();
	}

	String next() {
		String ret = new String();
		int curr = 0;
		int index;

		while (curr < len) {
			index = generator.nextInt(len);
			ret += alphabet[index];
			curr++;
		}

		return ret;
	}
}
