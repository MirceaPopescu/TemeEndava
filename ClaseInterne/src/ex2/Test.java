package ex2;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Test {
    class Observer1 implements ListObserver{

        @Override
        public void notifyEvent(ListEvent e) {

        }
    }


    public static void main(String[] args) {
        MyArrayList<String> vectorulMeu = new MyArrayList<String>();

        vectorulMeu.addObserver(new ListObserver() {
            @Override
            public void notifyEvent(ListEvent e) {
                System.out.println("OBS#1: Am primit eveniment " + e.getType() + " din lista " + e.getList() + " cu elementul " + e.getElement());
            }
        });

        vectorulMeu.addObserver(new ListObserver() {
            @Override
            public void notifyEvent(ListEvent e) {
                System.out.println("OBS#2: Am primit eveniment " + e.getType() + " din lista " + e.getList() + " cu elementul " + e.getElement());
            }
        });

        vectorulMeu.add("Pizza");
        vectorulMeu.add("Lasagna");
        vectorulMeu.remove(1);
        vectorulMeu.add("Pasta");
        vectorulMeu.set(0, "BANANE");
    }
}
