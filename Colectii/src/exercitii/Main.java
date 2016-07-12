package exercitii;

import java.util.*;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Student> ex1 = new HashSet<Student>();
        boolean ok;
        ok = ex1.add(new Student("asdf", 5));
        if (ok == false) {
            System.out.println("duplicate element!");
        }
        ok = ex1.add(new Student("asdf", 5));
        if (ok == false) {
            System.out.println("duplicate element!");
        }
        ok = ex1.add(new Student("asdf", 5));
        if (ok == false) {
            System.out.println("duplicate element!");
        }

        System.out.println("============================================");
        ArrayList<Student> vectorStudenti = new ArrayList<Student>();
        vectorStudenti.add(new Student("Mircea", 8));
        vectorStudenti.add(new Student());
        vectorStudenti.add(new Student());
        vectorStudenti.add(new Student("John Doe", 0));

        for (Student s : vectorStudenti) {
            System.out.println(s.equals(s));
            System.out.println(((Object) s).equals(s));
            System.out.println("--");
        }

        System.out.println("============================================");
        MyMap map = new MyMap(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        map.add(new Student("Mircea", 8));
        map.add(new Student("Alex", 7.23f));
        map.add(new Student("dummy", 9.41f));

        for (int k : map.keySet()) {
            Collections.sort(map.get(k));
            System.out.println(map.get(k));
        }

        System.out.println("============================================");
        MyHashSet myCollection = new MyHashSet();
        System.out.println(myCollection.add(7));
        System.out.println(myCollection.add(10));
        System.out.println(myCollection.add(7));

    }
}
