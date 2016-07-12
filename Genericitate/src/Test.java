import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by mipopescu on 7/12/2016.
 */
public class Test {
    public static void main(String[] args) {
        priorityQueueTest();
        System.out.println("---------------------------");
        sumabilTest();
        System.out.println("---------------------------");

    }

    static void priorityQueueTest() {
        System.out.println("PriorityQueue test! add/addAll/remove/isEmpty");

        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
        System.out.println(myPriorityQueue.isEmpty());
        myPriorityQueue.add(7);
        System.out.println(myPriorityQueue);
        myPriorityQueue.add(1);
        System.out.println(myPriorityQueue);
        myPriorityQueue.remove(2);
        System.out.println(myPriorityQueue);

        ArrayList<Integer> someArray = new ArrayList<Integer>();
        someArray.add(23);
        someArray.add(5);
        someArray.add(14);
        someArray.add(42);
        someArray.add(3);
        myPriorityQueue.addAll(someArray);

        System.out.println(myPriorityQueue.toString());
        myPriorityQueue.remove(4);
        System.out.println(myPriorityQueue);
        myPriorityQueue.remove(5);
        System.out.println(myPriorityQueue);
        System.out.println(myPriorityQueue.isEmpty());

        System.out.println("Test iterator");
        for (Integer i : myPriorityQueue) {
            System.out.println(i);
        }
    }

    static void sumabilTest() {

        System.out.println("Sumabil test");
        System.out.println("MyVector3");
        MyVector3 v1 = new MyVector3(25, 10, 40);
        MyVector3 v2 = new MyVector3(-25, 30, 100);

        v1.addValue(v2);
        System.out.println(v1);

        System.out.println("MyMatrix");
        MyMatrix mat1 = new MyMatrix();
        MyMatrix mat2 = new MyMatrix();

        System.out.println(mat1);
        System.out.println(mat2);

        mat1.addValue(mat2);
        System.out.println(mat1);

        List<MyVector3> listaVectori = new ArrayList<MyVector3>();
        listaVectori.add(new MyVector3(10, 10, 10));
        listaVectori.add(new MyVector3(-5, 27, 13));
        listaVectori.add(new MyVector3(-5, -37, -23));
        System.out.println(addAll(listaVectori));
    }

    static <T extends Sumabil> T addAll(Collection<T> coll) {
        T result = null;

        if (coll.isEmpty()) {
            return result;
        }

        for (T elem : coll) {
            if (result == null) {
                result = elem;
            } else {
                result.addValue(elem);
            }
        }

        return result;
    }
}
