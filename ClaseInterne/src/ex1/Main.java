package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Student>listaStudenti = new ArrayList<Student>();

        listaStudenti.add(new Student("Alex", 7));
        listaStudenti.add(new Student("Razvan", 8));
        listaStudenti.add(new Student("Mircea", 10));
        listaStudenti.add(new Student("Cristian", 5));
        Student stud = new Student();
        Person pers = new Person();

        /* Sortare cu clasa interna simpla */
        Collections.sort(listaStudenti, stud.new Alfabetic() );
        System.out.println(listaStudenti);
        /* Sortare cu clasa interna statica */
        Collections.sort(listaStudenti, new Student.Nota());
        System.out.println(listaStudenti);
        /* Sortare cu clase anonime */
        Collections.sort(listaStudenti, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return -o1.getGrade().compareTo(o2.getGrade());
            }
        });
        System.out.println(listaStudenti);
    }
}
