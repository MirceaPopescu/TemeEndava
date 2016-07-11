package Exercitii;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class CoadaMostenire extends Array {
    int front;
    int back;
    int size;

    CoadaMostenire() {
        super();
        front = 0;
        back = 0;
    }

    int push(int i) {
        int ret = set(back, i);
        back++;

        /* Verificare eroare (coada era plina) */
        if(ret == ERROR){
            back--;
            System.out.println("Coada plina!");
        }
        return ret;
    }

    int pop(){
        int ret = get(front);
        front++;

        /* Verificare eroare (coada era goala) */
        if(ret == ERROR){
            front--;
            System.out.println("Coada goala!");
        }
        return ret;
    }

}
