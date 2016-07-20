package ex1.part2;

import java.util.ArrayList;

/**
 * Created by mipopescu on 7/20/2016.
 */
public class PrimeNumberThread extends Thread {
    int[] input;
    ArrayList<Integer> output;
    int id, nThreads;
    int problemSize;

    public PrimeNumberThread(int[] input, ArrayList<Integer> output, int i,
                             int problemSize, int nThreads) {
        this.input = input;
        this.output = output;
        this.id = i;
        this.nThreads = nThreads;
        this.problemSize = problemSize;
    }

    @Override
    public void run() {
        int start = id * (problemSize / nThreads);
        int stop = (id + 1) * (problemSize / nThreads);
        if(id == nThreads - 1){
            stop = problemSize;
        }

        for(int i = start; i < stop; i++){
            int currentNumber = input[i];
            if( isPrime(currentNumber) ){
                synchronized (output){
                    output.add(currentNumber);
                }
            }
        }
    }

    private boolean isPrime(int number){



        for(int i = 2; i * i < number; i++){
            if( number % i == 0){
                return false;
            }
        }

        return true;
    }
}
