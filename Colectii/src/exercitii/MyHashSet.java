package exercitii;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class MyHashSet extends HashSet<Integer> {
    int count;

    MyHashSet() {
        super();
        this.count = 0;
    }

    @Override
    public boolean add(Integer integer) {
        count++;
        return super.add(integer);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        count += c.size();
        return super.addAll(c);
    }
}
