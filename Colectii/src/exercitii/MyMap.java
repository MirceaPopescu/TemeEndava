package exercitii;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class MyMap extends TreeMap<Integer, List<Student>> {

    public MyMap(Comparator<Integer> c){
        super(c);
    }

    public void add(Student s){
        int m = Math.round(s.medie);
        if( super.get(m) == null){
            LinkedList<Student> lst = new LinkedList<Student>();
            super.put(m, lst);
        }

        List<Student> lst = super.get(m);
        lst.add(s);
    }
}
