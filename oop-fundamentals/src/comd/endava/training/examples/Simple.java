package comd.endava.training.examples;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class Simple {
    int i;
    Simple(int i) {i=5;}
}

/* Compilation didn't work right away. Needed a default constructor (super constructor) */
class ExtendSimple extends Simple{

    ExtendSimple(){
        super(0);
        System.out.println("Hello from constructor with 0 args!");
    }
    ExtendSimple(int i){
        super(i);
        System.out.println("Hello from constructor with 1 args!");
    }
    ExtendSimple(int i, int j){
        super(i+j);
        System.out.println("Hello from constructor with 2 args!");
    }
}
