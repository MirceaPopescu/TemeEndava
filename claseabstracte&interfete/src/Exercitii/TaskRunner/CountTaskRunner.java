package Exercitii.TaskRunner;

import Exercitii.Containers.Factory.strategy;
import Exercitii.Tasks.Task;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class CountTaskRunner extends AbstractTaskRunner {
    int contor;

    CountTaskRunner(strategy strategy) {
        super(strategy);
        contor = 0;
    }

    @Override
    protected void abstractAction(Task task) {
            contor++;
    }
}
