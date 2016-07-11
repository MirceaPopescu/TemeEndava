package Exercitii.Containers.Factory;

import Exercitii.Containers.Container;
import Exercitii.Containers.Queue;
import Exercitii.Containers.Stack;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class Factory implements IFactory {
    @Override
    public Container createContainer(strategy strategy) {
        if( strategy == strategy.LIFO ){
            return new Stack();
        }

        if( strategy == strategy.FIFO ){
            return new Queue();
        }

        return null;
    }
}
