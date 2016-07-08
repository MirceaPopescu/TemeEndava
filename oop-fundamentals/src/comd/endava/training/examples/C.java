package comd.endava.training.examples;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class C extends B{
    void f(){
        System.out.println("Hello from C");
    }

    void f(int param1){
        System.out.println("Hello from C - one arg");
    }

    void f(int param1, int param2){
        System.out.println("Hello from C - two args");
    }
}
