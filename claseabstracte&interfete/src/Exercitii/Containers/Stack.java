package Exercitii.Containers;

import Exercitii.Tasks.Task;

import java.util.ArrayList;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Stack implements  Container {
    ArrayList<Task> tasks;
    int size;

    public Stack(){
        size = 0;
        tasks = new ArrayList<Task>();
    }

    @Override
    public Task pop() {
        Task ret = tasks.remove(size - 1);
        size--;
        return ret;
    }

    @Override
    public void push(Task task) {
        tasks.add(task);
        size++;
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
