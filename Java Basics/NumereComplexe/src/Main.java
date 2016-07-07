
public class Main {

	public static void main(String[] args) {
		NumarComplex a = new NumarComplex(2, 3);
		NumarComplex b = new NumarComplex(1, -5);

		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		System.out.println("a + b = " + Operatii.add(a, b));
		System.out.println("a - b = " + Operatii.sub(a, b));
		System.out.println("a * b = " + Operatii.mul(a, b));
	}

}
