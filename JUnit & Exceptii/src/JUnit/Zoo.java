package JUnit;
import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animals;

	Zoo() {
		this.animals = new ArrayList<Animal>();
	}

	void addAnimal(Animal a) {
		this.animals.add(a);
	}

	boolean removeAnimal(Animal a) {
		return this.animals.remove(a);
	}

	boolean areAnimals() {
		return !this.animals.isEmpty();
	}

	ArrayList<Animal> getAnimals() {
		return this.animals;
	}

	int size() {
		return this.animals.size();
	}
}
