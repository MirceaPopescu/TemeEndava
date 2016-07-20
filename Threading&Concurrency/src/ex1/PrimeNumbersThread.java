package ex1;

import java.util.LinkedList;

/**
 * Created by mipopescu on 7/20/2016.
 */
public class PrimeNumbersThread extends Thread {
    LinkedList<Integer> inputs;
    LinkedList<Integer> outputs;

    PrimeNumbersThread(LinkedList<Integer> inputList, LinkedList<Integer> outputList) {
        this.inputs = inputList;
        this.outputs = outputList;
    }

    @Override
    public void run() {
        Integer current;

        while (1 < 2) {
            synchronized (inputs) {
                if (inputs.isEmpty()) {
                    return;
                } else {
                    current = inputs.remove(0);
                }
            }

            if (isPrime(current)) {
                synchronized (outputs) {
                    outputs.add(current);
                }
            }
        }
    }

    private boolean isPrime(Integer x) {
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

}
