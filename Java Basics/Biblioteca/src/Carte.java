
public class Carte {
	String titlu;
	String autor;
	String editura;
	Integer numarPagini;

	public boolean equals(Object o) {
		Carte c = (Carte) o;

		return this.titlu.equals(c.titlu) && this.autor.equals(c.autor) && this.editura.equals(c.editura)
				&& this.numarPagini.equals(c.numarPagini);
	}

	public String toString() {
		return new String(this.titlu.toUpperCase() + ", " + this.autor + ", " + this.editura.toLowerCase());
	}
}
