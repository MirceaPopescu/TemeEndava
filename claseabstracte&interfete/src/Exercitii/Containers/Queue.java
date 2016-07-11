package Exercitii.Containers;

import Exercitii.Tasks.Task;

import java.util.ArrayList;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Queue implements Container {
    int size;
    ArrayList<Task> tasks;

    public Queue(){
        size = 0;
        tasks = new ArrayList<Task>();
    }

    @Override
    public Task pop() {
        size--;
        return tasks.remove(0);
    }

    @Override
    public void push(Task task) {
        size++;
        tasks.add(task);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty() ){
            push(container.pop() );
        }
    }
}
