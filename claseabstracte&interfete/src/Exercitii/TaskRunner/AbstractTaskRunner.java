package Exercitii.TaskRunner;

import Exercitii.Containers.Container;
import Exercitii.Containers.Factory.Factory;
import Exercitii.Tasks.Task;
import Exercitii.Containers.Factory.strategy;

/**
 * Created by mipopescu on 7/11/2016.
 */
public abstract class AbstractTaskRunner {
    Factory fact;
    Container container;


    AbstractTaskRunner(strategy strategy){
        this.fact = new Factory();
        this.container = this.fact.createContainer(strategy);
    }

    void addTask(Task task){
        this.container.push(task);
    }

    void executeAll(){
        while( !container.isEmpty() ){
            Task task = container.pop();
            abstractAction(task);
            task.execute();
        }
    }

    abstract protected void abstractAction(Task task);
    void redo(){}
}
