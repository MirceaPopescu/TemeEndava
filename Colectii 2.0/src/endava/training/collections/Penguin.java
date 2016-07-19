package endava.training.collections;

import java.util.ArrayList;
import java.util.List;

public class Penguin {
	
	private String name;
	private PenguinRace race;
	private double age;
	private List<Penguin> matingPartners;
	
	public Penguin(String name, PenguinRace race, double age) {
		this.name = name;
		this.race = race;
		this.age = age;
		this.matingPartners = new ArrayList<Penguin>();
	}

	@Override
	public String toString() {
		return "Penguin{" +
				"name='" + name + '\'' +
				", race=" + race +
				", age=" + age +
				", matingPartners=" + matingPartners.size() +
				'}';
	}

	/*
	@Override
	public int hashCode() {
		return 7;
		//return super.hashCode();
	}*/

	public String getName() {
		return name;
	}

	public PenguinRace getRace() {
		return race;
	}

	public double getAge() {
		return age;
	}

	public List<Penguin> getMatingPartners() {
		return matingPartners;
	}

	public void setMatingPartners(List<Penguin> matingPartners) {
		this.matingPartners = matingPartners;
	}


	public String toString1() {
		return "Penguin{" +
				"name='" + name + '\'' +
				", race=" + race +
				", age=" + age +
				", matingPartners=" + matingPartners +
				']';
	}
}
