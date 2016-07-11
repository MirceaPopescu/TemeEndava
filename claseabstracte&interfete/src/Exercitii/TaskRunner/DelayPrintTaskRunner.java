package Exercitii.TaskRunner;

import Exercitii.Containers.Factory.strategy;
import Exercitii.Tasks.Task;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class DelayPrintTaskRunner extends PrintTaskRunner {
    long delay;

    DelayPrintTaskRunner(strategy strategy, long delay){
        super(strategy);
        this.delay = delay;
    }

    DelayPrintTaskRunner(strategy strategy) {
        super(strategy);
        this.delay = 0;
    }

    protected void abstractAction(Task task){
        super.abstractAction(task);
        try {
            Thread.sleep(delay);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
