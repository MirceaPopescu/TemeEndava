import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class PriorityQueue<T extends Comparable> implements Iterable<T>{
    private LinkedList<T> queue;
    private class MyIterator implements Iterator<T>{
        int curr;

        MyIterator(){
            int curr = 0;
        }

        @Override
        public boolean hasNext() {
            return curr < queue.size();
        }

        @Override
        public T next() {
            return queue.get(curr++);
        }
    };

    public PriorityQueue() {
        this.queue = new LinkedList<T>();
    }

    public void add(T element) {
        int i = 0;
        while (i < queue.size()) {
            if (element.compareTo(queue.get(i)) < 0) {
                queue.add(i, element);
                break;
            } else {
                i++;
            }
        }

        if (i == queue.size()) {
            queue.add(i, element);
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T remove(int index) {
        if (index >= queue.size() || index < 0) {
            return null;
        }

        return queue.remove(index);
    }

    public void addAll(Collection<T> coll) {
        for (T element : coll) {
            this.add(element);
        }
    }

    public String toString() {
        String ret = new String("[ ");
        int i = 0;
        for (T element : queue) {
            i++;
            ret += element;
            if (i == queue.size()) {
                ret += "]";
            } else {
                ret += ", ";
            }
        }

        return ret;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
}
