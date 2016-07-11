package ex1;

import java.util.Comparator;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Person {

    class Alfabetic implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    // protected not private, because subclasses may need it (any person has a name)
    protected String name;

    public Person(){
        name = "";
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

