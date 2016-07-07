
public class Verificari {
	static boolean isTwice(Carte a, Carte b) {
		return a.equals(b);
	}

	static Carte whichIsThicker(Carte a, Carte b) {
		if (a.numarPagini > b.numarPagini) {
			return a;
		} else {
			return b;
		}
	}
}
