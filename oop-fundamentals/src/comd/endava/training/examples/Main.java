package comd.endava.training.examples;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class Main {
    public static void main(String[] args) {

        Simple s = new ExtendSimple();

        /* even though the compiler expected an A, at runtime it's a B */
        A a = new B();
        a.f(); /* Hello from B */

        /* even though the compiler expected a B, at runtime it's a C */
        B b = new C();
        b.f(); /* Hello from C */

        /* compiler expected a C, got a C and will also be a C at runtime */
        C c = new C();
        c.f(); /* Hello from C */

        A d = new C();
        d.f(); /* will print "Hello from C" */
    }
}
