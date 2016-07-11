package Exercitii.TaskRunner;

import Exercitii.Containers.Factory.strategy;
import Exercitii.Tasks.Increment;
import Exercitii.Tasks.PrintMessage;
import Exercitii.Tasks.RandomNumber;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        AbstractTaskRunner taskRunner = new RedoTaskRunner(strategy.FIFO);

        taskRunner.addTask(new PrintMessage("Nu neaparat manele, dar ceva sa placa la toata lumea"));
        taskRunner.addTask(new Increment());
        taskRunner.addTask(new RandomNumber());
        taskRunner.addTask(new PrintMessage("dummy text"));

        taskRunner.executeAll();

        taskRunner.redo();
    }
}
