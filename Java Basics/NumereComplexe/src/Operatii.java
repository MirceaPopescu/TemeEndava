
public class Operatii {
	static NumarComplex add(NumarComplex a, NumarComplex b) {
		return new NumarComplex(a.re + b.re, a.im + b.im);
	}

	static NumarComplex sub(NumarComplex a, NumarComplex b) {
		return new NumarComplex(a.re - b.re, a.im - b.im);
	}

	static NumarComplex mul(NumarComplex a, NumarComplex b) {
		return new NumarComplex(a.re * b.re - a.im * b.im, a.re * b.im + a.im * b.re);
	}

	/* Pentru Division/Modulo am gasit ceva pe net, seems overkill */
}
