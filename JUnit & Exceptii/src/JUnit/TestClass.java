package JUnit;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import org.junit.Assert;

public class TestClass {
	private Zoo zoo;

	@Before
	public void setup() {
		zoo = new Zoo();
	}

	@Test
	public void testAddAnimal() {
		Animal a = new Animal();
		zoo.addAnimal(a);
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(a);

		Assert.assertEquals(zoo.getAnimals(), animals);
	}

	@Test
	public void testRemoveAnimal() {
		Animal a = new Animal();
		zoo.addAnimal(a);
		Assert.assertTrue(zoo.removeAnimal(a));
	}

	@Test
	public void testAreAnimalsInZoo() {
		Animal a = new Animal();
		zoo.addAnimal(a);

		if (!zoo.areAnimals()) {
			Assert.fail();
		}
	}
	
	@Test
	public void testGetAnimals(){
		Animal a = new Animal();
		Animal b = new Animal();
		
		zoo.addAnimal(a);
		zoo.addAnimal(b);
		
		ArrayList<Animal> animals = zoo.getAnimals();
		ArrayList<Animal> newAnimals = new ArrayList<Animal>();
		newAnimals.add(a);
		newAnimals.add(b);
		Assert.assertFalse(!animals.equals(newAnimals));
	}
}
