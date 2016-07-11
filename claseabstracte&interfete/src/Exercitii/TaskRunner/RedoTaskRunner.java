package Exercitii.TaskRunner;

import Exercitii.Containers.Factory.strategy;
import Exercitii.Containers.Stack;
import Exercitii.Tasks.Task;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class RedoTaskRunner extends AbstractTaskRunner {
    Stack stiva;

    RedoTaskRunner(strategy strategy) {
        super(strategy);
        stiva = new Stack();
    }

    @Override
    protected void abstractAction(Task task) {
        stiva.push(task);
    }

    void redo(){
        while( !stiva.isEmpty() ){
            stiva.pop().execute();
        }
    }
}
