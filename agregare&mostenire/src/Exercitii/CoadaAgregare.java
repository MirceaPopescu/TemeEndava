package Exercitii;

/**
 * Created by mipopescu on 7/11/2016.
 */
public class CoadaAgregare {
    private Array array;
    int front;
    int back;

    CoadaAgregare(){
        array = new Array();
        front = 0;
        back = 0;
    }

    int pop(){
        int ret = array.get(front);
        front++;

        if( ret == array.ERROR ){
            front--;
            System.out.println("Coada goala");
        }
        return ret;
    }

    int push(int i){
        int ret = array.set(back, i);
        back++;

        if( ret == array.ERROR ){
            back--;
            System.out.println("Coada plina");
        }
        return ret;
    }
}
