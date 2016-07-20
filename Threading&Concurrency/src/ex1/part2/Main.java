package ex1.part2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mipopescu on 7/20/2016.
 */
public class Main {
    public static final int PROBLEM_SIZE = 100000;
    public static final int N_THREADS = 4;
    public static final long RANDOM_SEED = 7;

    public static void main(String[] args) {
        Random random = new Random(RANDOM_SEED);
        int[] input = new int[PROBLEM_SIZE];
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < PROBLEM_SIZE; i++) {
            input[i] = Math.abs(random.nextInt());
        }

        PrimeNumberThread[] threads = new PrimeNumberThread[N_THREADS];

        long start = System.currentTimeMillis();
        /* Create threads */
        for (int i = 0; i < N_THREADS; i++) {
            threads[i] = new PrimeNumberThread(input, output, i,
                    PROBLEM_SIZE, N_THREADS);
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

