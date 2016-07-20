package ex1;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by mipopescu on 7/20/2016.
 */
public class Main {
    public static final int N_THREADS = 1;
    public static final int PROBLEM_SIZE = 100000;
    public static final long RANDOM_SEED = 7;

    public static void main(String[] args) {
        Random random = new Random(RANDOM_SEED);
        LinkedList<Integer> input = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        for (int i = 0; i < PROBLEM_SIZE; i++) {
            input.add(Math.abs(new Integer(random.nextInt())));
        }

        PrimeNumbersThread[] threads = new PrimeNumbersThread[N_THREADS];

        long start = System.currentTimeMillis();
        /* Create threads */
        for (int i = 0; i < N_THREADS; i++) {
            threads[i] = new PrimeNumbersThread(input, output);
        }

        /* Start threads */
        for (int i = 0; i < N_THREADS; i++) {
            threads[i].run();
        }

        /* Wait for threads to finish their work */
        for (int i = 0; i < N_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}
