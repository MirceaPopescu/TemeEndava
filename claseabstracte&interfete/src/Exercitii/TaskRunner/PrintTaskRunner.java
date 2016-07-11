package Exercitii.TaskRunner;

import Exercitii.Containers.Factory.strategy;
import Exercitii.Tasks.Task;

import java.util.Date;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class PrintTaskRunner extends AbstractTaskRunner {
    PrintTaskRunner(strategy strategy) {
        super(strategy);
    }

    @Override
    protected void abstractAction(Task task) {
        Date data = new Date();
        System.out.println(data.getTime());
    }
}
