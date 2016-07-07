import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Carte oCarte = new Carte();

		System.out.println("Titlu:");
		oCarte.titlu = in.nextLine();
		System.out.println("Autor:");
		oCarte.autor = in.nextLine();
		System.out.println("Editura:");
		oCarte.editura = in.nextLine();
		System.out.println("Numar Pagini:");
		oCarte.numarPagini = new Integer(in.nextLine());
		while (oCarte.numarPagini.equals(0)) {
			System.out.println("Ai pus numarul de pagini egal cu 0. Pune alta valoare");
			oCarte.numarPagini = new Integer(in.nextLine());
		}
		in.close();

		Carte testSubject = new Carte();
		testSubject.titlu = "a";
		testSubject.editura = "a";
		testSubject.numarPagini = 100;
		testSubject.autor = "a";

		if (Verificari.isTwice(oCarte, testSubject)) {
			System.out.println("cartea e aceiasi cu cea de test");
		} else {
			System.out.println("cele doua carti sunt diferite");
		}

		System.out.println("Cartea mai groasa este: " + Verificari.whichIsThicker(oCarte, testSubject));
	}

}
