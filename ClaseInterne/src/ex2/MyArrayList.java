package ex2;


import java.util.ArrayList;
import java.util.Observer;

public class MyArrayList<E> extends ArrayList<E> implements Observable {
    /*TODO
     * - extend ArrayList and implement Observable
     * - override methods
     */
    ArrayList<ListObserver> observers;

    public MyArrayList() {
        super();
        observers = new ArrayList<ListObserver>();
    }

    @Override
    public boolean add(E e) {
        MyArrayList<E> lst = this;

        ListEvent ev = new ListEvent(EventType.ADD) {
            @Override
            public MyArrayList getList() {
                return lst;
            }

            @Override
            public Object getElement() {
                return e;
            }

            @Override
            public long getDuration() {
                return 0;
            }
        };
        for (ListObserver obs : observers) {
            obs.notifyEvent(ev);
        }
        return super.add(e);
    }

    @Override
    public E remove(int index) {
        MyArrayList<E> lst = this;
        E ret = super.remove(index);
        ListEvent ev = new ListEvent(EventType.REMOVE) {
            @Override
            public MyArrayList getList() {
                return lst;
            }

            @Override
            public Object getElement() {
                return ret;
            }

            @Override
            public long getDuration() {
                return 0;
            }
        };

        for (ListObserver obs : observers) {
            obs.notifyEvent(ev);
        }

        return ret;
    }

    @Override
    public E set(int index, E element) {
        MyArrayList<E> lst = this;
        ListEvent ev = new ListEvent(EventType.SET) {
            @Override
            public MyArrayList getList() {
                return lst;
            }

            @Override
            public Object getElement() {
                return element;
            }

            @Override
            public long getDuration() {
                return 0;
            }
        };

        for (ListObserver obs : observers) {
            obs.notifyEvent(ev);
        }

        return super.set(index, element);
    }

    @Override
    public void addObserver(ListObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ListObserver o) {
        observers.remove(o);
    }
}
