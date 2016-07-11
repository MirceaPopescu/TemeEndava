package ex1;

import java.util.Comparator;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Student extends Person{

    private Integer grade;
    static class Nota implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return -o1.getGrade().compareTo(o2.getGrade());
        }
    }


    public Student(){}

    public Student(String name){
        super(name);
    }

    public Student(String name, Integer grade){
        super(name);
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String toString(){
        return this.name + " " + this.grade;
    }
}

