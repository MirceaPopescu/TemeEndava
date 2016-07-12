package exercitii;

import java.util.Objects;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class Student implements Comparable<Student>{
    String nume;
    float medie;

    Student(){
        this.nume = "John Doe";
        this.medie = 0;
    }

    Student(String nume, float medie){
        this.nume = nume;
        this.medie = medie;
    }

    public boolean equals(Student s){
        return false;
    }

    public boolean equals(Object o){
        return this.hashCode() == o.hashCode();
    }

    public int hashCode(){
        return (int) (medie + nume.hashCode());
    }

    @Override
    public int compareTo(Student o) {
        return this.nume.compareTo(o.nume);
    }
}
