
public class NumarComplex {
	float re;
	float im;

	NumarComplex() {
		re = 0;
		im = 0;
	}

	NumarComplex(float a, float b) {
		this.re = a;
		this.im = b;
	}

	@Override
	public String toString() {

		String ret;
		if (this.im > 0) {
			ret = this.re + " + " + this.im + "i";
		} else {
			ret = this.re + " " + this.im + "i";
		}
		return ret;
	}
}
