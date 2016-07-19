package endava.training.collections;

import java.util.*;


public class PenguinFun {

	public static void main(String [] args){
		System.out.println("----Task #1----------------");
		PenguinHatchery ph = new PenguinHatchery();

		HashSet<Penguin> hashSetOfPenguins = new HashSet<>();
		ArrayList<Penguin> arrayOfPenguins = new ArrayList<>();

		for(int i =0 ; i < 10; i++){
			arrayOfPenguins.add(ph.hatchPenguin());
			hashSetOfPenguins.add(arrayOfPenguins.get(i));
		}

		for(Penguin penguin : arrayOfPenguins){
			System.out.println(penguin);
		}

		System.out.println("-------------------------------------");
		for(Penguin penguin : hashSetOfPenguins){
			System.out.println(penguin);
		}

		/* Conclusion: penguins were the same in both prints, but their order had changed */

		System.out.println("----Task #2----------------");

		/* anonymous class. hardcore */
		Collections.sort(arrayOfPenguins, new Comparator<Penguin>(){

			@Override
			public int compare(Penguin o1, Penguin o2) {
				int compRezult = o1.getRace().toString().compareTo(o2.getRace().toString());
				if( compRezult != 0){
					return compRezult;
				}

				return ((Double) o1.getAge()).compareTo(o2.getAge());
			}
		});


		Random rand = new Random();
		for(Penguin p : arrayOfPenguins){
			System.out.println(p);
			ArrayList<Penguin> backupArray = (ArrayList<Penguin>) arrayOfPenguins.clone();
			backupArray.remove(p);
			int i = rand.nextInt(2) + 1;
			for(int j = 0; j <= i; j++){
				int k = rand.nextInt(9 - j);
				p.getMatingPartners().add(backupArray.remove(k));
			}
		}


		Collections.sort(arrayOfPenguins, new Comparator<Penguin>(){

			@Override
			public int compare(Penguin o1, Penguin o2) {
				int compResult = ((Integer) o1.getMatingPartners().size()).compareTo(o2.getMatingPartners().size());
				if( compResult == 0){
					double avg1 = 0;
					double avg2 = 0;
					int curr = 0;
					for(Penguin p : o1.getMatingPartners()){
						curr++;
						avg1 += p.getAge();
					}

					avg1 = avg1 / curr;
					curr = 0;
					for(Penguin p : o2.getMatingPartners()){
						curr++;
						avg2 += p.getAge();
					}

					avg2 = avg2 / curr;
					return ((Double) avg1).compareTo(avg2);
				}

				return compResult;
			}
		});

		System.out.println("Sorting by number of mates and their average age");
		for(Penguin p : arrayOfPenguins){
			System.out.println(p.toString1());
		}

		/* Can't order them inside a HashSet (the HashSet does not keep a specific ordering) */

		System.out.println("----Task #3----------------");

		HashMap<PenguinRace, ArrayList<Penguin>> mapOfPenguins = new HashMap<>();
		for(Penguin p : arrayOfPenguins ){
			PenguinRace race = p.getRace();
			ArrayList<Penguin> lst = mapOfPenguins.get(race);
			if( lst == null){
				lst = new ArrayList<Penguin>();
			}
			lst.add(p);
			mapOfPenguins.put(race, lst);
		}

		for(PenguinRace r : PenguinRace.values() ){
			ArrayList<Penguin> penguins = mapOfPenguins.get(r);
			System.out.println(r + " penguins:");
			System.out.println(penguins);
		}


	}

	public static void Task1(){

	}
}	
